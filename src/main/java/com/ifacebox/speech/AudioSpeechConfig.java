package com.ifacebox.speech;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author znn
 */

@Component
@ConfigurationProperties(prefix = "config.audio.speech")
public class AudioSpeechConfig {
    private String ip;
    private int port;
    private String devId;
    private String devKey;
    private int sampleRate;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getDevKey() {
        return devKey;
    }

    public void setDevKey(String devKey) {
        this.devKey = devKey;
    }

    public int getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(int sampleRate) {
        this.sampleRate = sampleRate;
    }

    public long getRequestSendTimestamp() {
        return System.currentTimeMillis() / 1000L;
    }

    public String getSignature(long ts) {
        return HmacUtils.hmacSha256Hex(this.getDevKey(), this.getDevId() + ts);
    }

    public String getApiKey(long ts) {
        return this.getDevId() + "," + ts + "," + this.getSignature(ts);
    }

}
