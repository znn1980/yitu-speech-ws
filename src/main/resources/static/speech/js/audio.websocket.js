const AudioWebSocket = function (audioSpeechURL, mediaStream, openCallback, closeCallback, messageCallback, errorCallback) {
    const webSocket = new WebSocket(audioSpeechURL);
    const audioRecorder = new AudioRecorder(mediaStream, function (data) {
        if (webSocket.readyState === WebSocket.OPEN) {
            webSocket.send(data);
        }
    });
    this.stop = function () {
        audioRecorder.stop();
        webSocket.close();
    };
    webSocket.binaryType = 'arraybuffer';
    webSocket.onopen = function () {
        console.log(audioSpeechURL);
        console.log('WebSocket连接成功！');
        audioRecorder.start();
        typeof openCallback === 'function' && openCallback();
    };
    webSocket.onclose = function () {
        console.log('WebSocket连接关闭！')
        stop();
        typeof closeCallback === 'function' && closeCallback();
    };
    webSocket.onerror = function () {
        console.log('WebSocket连接异常！')
        stop();
        typeof errorCallback === 'function' && errorCallback('WebSocket连接异常！');
    };
    webSocket.onmessage = function (ev) {
        console.log('数据：' + ev.data);
        const data = JSON.parse(ev.data);
        if (typeof data.final === 'undefined') {
            stop();
            typeof errorCallback === 'function' && errorCallback('语音转写异常！【' + data.text + '】');
        } else {
            typeof messageCallback === 'function' && messageCallback(data);
        }
    };
};