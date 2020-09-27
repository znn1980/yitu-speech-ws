const AudioWebSocket = function (wsUrl, mediaStream, openCallback, closeCallback, messageCallback) {
    const webSocket = new WebSocket(wsUrl);
    const audioRecorder = new AudioRecorder(mediaStream, webSocket);
    this.stop = function () {
        audioRecorder.stop();
        if (webSocket) {
            webSocket.close();
        }
        typeof closeCallback === 'function' && closeCallback();
    };
    webSocket.binaryType = 'arraybuffer';
    webSocket.onopen = function () {
        console.log('连接成功');
        audioRecorder.start();
        typeof openCallback === 'function' && openCallback();
    };
    webSocket.onclose = function () {
        console.log('连接关闭')
        stop();
    };
    webSocket.onerror = function () {
        console.log('连接异常')
        stop();
    };
    webSocket.onmessage = function (ev) {
        console.log('数据：' + ev.data);
        const data = JSON.parse(ev.data);
        typeof messageCallback === 'function' && messageCallback(data);
    };
};