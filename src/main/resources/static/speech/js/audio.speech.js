const audioSpeech = {
    audioWebSocket: null
    , start: function (audioSpeechURL, openCallback, closeCallback, messageCallback, errorCallback) {
        if (navigator.getUserMedia) {
            navigator.getUserMedia({
                audio: true
            }, function (mediaStream) {
                audioSpeech.audioWebSocket = new AudioWebSocket(audioSpeechURL, mediaStream, function () {
                    typeof openCallback === 'function' && openCallback();
                }, function () {
                    typeof closeCallback === 'function' && closeCallback();
                }, function (data) {
                    typeof messageCallback === 'function' && messageCallback(data);
                }, errorCallback);
            }, function (error) {
                typeof errorCallback === 'function' && errorCallback("麦克风授权失败！【" + (error.code || error.name) + "】");
            });
        } else {
            typeof errorCallback === 'function' && errorCallback("浏览器不支持麦克风！");
        }
    }
    , stop: function () {
        audioSpeech.audioWebSocket.stop();
    }
};