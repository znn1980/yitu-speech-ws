const AudioWebSocket = function (audioSpeechURL, mediaStream, openCallback, closeCallback, messageCallback, errorCallback) {
    const webSocket = new WebSocket(audioSpeechURL);
    const audioRecorder = new AudioRecorder(mediaStream, function (data) {
        if (webSocket) {
            webSocket.send(data);
        }
    });
    this.stop = function () {
        audioRecorder.stop();
        if (webSocket) {
            webSocket.close();
        }
        typeof closeCallback === 'function' && closeCallback();
    };
    webSocket.binaryType = 'arraybuffer';
    webSocket.onopen = function () {
        console.log('WebSocket连接成功！');
        audioRecorder.start();
        typeof openCallback === 'function' && openCallback();
    };
    webSocket.onclose = function () {
        console.log('WebSocket连接关闭！')
        stop();
    };
    webSocket.onerror = function () {
        console.log('WebSocket连接异常！')
        stop();
        typeof errorCallback === 'function' && errorCallback('WebSocket连接异常！');
    };
    webSocket.onmessage = function (ev) {
        console.log('数据：' + ev.data);
        const data = JSON.parse(ev.data);
        typeof messageCallback === 'function' && messageCallback(data);
    };
};