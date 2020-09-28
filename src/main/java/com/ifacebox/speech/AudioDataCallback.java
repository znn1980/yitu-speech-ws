package com.ifacebox.speech;

/**
 * @author znn
 */
public interface AudioDataCallback {
    /**
     * 实时语音转写文字回调
     *
     * @param isFinal 是否最终结果
     * @param text
     */
    void onText(boolean isFinal, String text);

    /**
     * 实时语音转写异常回调
     *
     * @param t
     */
    void onError(Throwable t);
}
