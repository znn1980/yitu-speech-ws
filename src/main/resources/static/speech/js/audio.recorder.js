const AudioRecorder = function (mediaStream, sendCallback) {
    const sampleBits = 16; //输出采样数位
    const sampleRate = 16000; //输出采样率
    const sendBufferSize = 1024;
    const bufferSize = 4096;
    const inputChannels = 1;
    const outputChannels = 1;
    const sendWsCallback = sendCallback || function (data) {
        console.log(data);
    };
    const audioContext = new AudioContext();
    const mediaStreamSource = audioContext.createMediaStreamSource(mediaStream);
    const scriptProcessor = audioContext.createScriptProcessor(bufferSize, inputChannels, outputChannels);
    const audioData = {
        size: 0 //录音文件长度
        , buffer: [] //录音缓存
        , inputSampleRate: 48000 //输入采样率
        , inputSampleBits: sampleBits //输入采样数位 8, 16
        , outputSampleRate: sampleRate //输出采样数位
        , outputSampleBits: sampleBits //输出采样率
        , clear: function () {
            this.buffer = [];
            this.size = 0;
        }
        , put: function (data) {
            this.buffer.push(new Float32Array(data));
            this.size += data.length;
        }
        , compress: function () {
            const data = new Float32Array(this.size);
            let offset = 0;
            for (let i = 0; i < this.buffer.length; i++) {
                data.set(this.buffer[i], offset);
                offset += this.buffer[i].length;
            }
            const compression = this.inputSampleRate / this.outputSampleRate;
            const length = data.length / compression;
            const result = new Float32Array(length);
            let index = 0, j = 0;
            while (index < length) {
                result[index] = data[j];
                j += compression;
                index++;
            }
            return result;
        }
        , pcm: function () {
            const sampleRate = Math.min(this.inputSampleRate, this.outputSampleRate);
            const sampleBits = Math.min(this.inputSampleBits, this.outputSampleBits);
            const bytes = this.compress();
            const dataLength = bytes.length * (sampleBits / 8);
            const buffer = new ArrayBuffer(dataLength);
            const data = new DataView(buffer);
            let offset = 0;
            for (let i = 0; i < bytes.length; i++, offset += 2) {
                const s = Math.max(-1, Math.min(1, bytes[i]));
                data.setInt16(offset, s < 0 ? s * 0x8000 : s * 0x7FFF, true);
            }
            return new Blob([data]);
        }
    };
    const sendData = function () {
        const fileReader = new FileReader();
        fileReader.onload = function (e) {
            const buffer = new Int8Array(e.target.result);
            if (buffer.length > 0) {
                let tmpBuffer = new Int8Array(sendBufferSize);
                let j = 0;
                for (let i = 0; i < buffer.byteLength; i++) {
                    tmpBuffer[j++] = buffer[i];
                    if (((i + 1) % sendBufferSize) == 0) {
                        sendWsCallback(tmpBuffer);
                        if (buffer.byteLength - i - 1 >= sendBufferSize) {
                            tmpBuffer = new Int8Array(sendBufferSize);
                        } else {
                            tmpBuffer = new Int8Array(buffer.byteLength - i - 1);
                        }
                        j = 0;
                    }
                    if ((i + 1 == buffer.byteLength) && ((i + 1) % sendBufferSize) != 0) {
                        sendWsCallback(tmpBuffer);
                    }
                }
            }
        };
        fileReader.readAsArrayBuffer(audioData.pcm());
        audioData.clear();
    };
    this.start = function () {
        console.log('麦克风打开！')
        mediaStreamSource.connect(scriptProcessor);
        scriptProcessor.connect(audioContext.destination);
    };
    this.stop = function () {
        console.log('麦克风关闭！')
        scriptProcessor.disconnect();
    };
    scriptProcessor.onaudioprocess = function (e) {
        const inputBuffer = e.inputBuffer.getChannelData(0);
        audioData.put(inputBuffer);
        sendData();
    };
};