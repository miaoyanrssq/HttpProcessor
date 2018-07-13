package cn.zgy.processor.HttpProcessor;

public interface ICallback {
    void onSuccess(String result);
    void onFail(String e);
}
