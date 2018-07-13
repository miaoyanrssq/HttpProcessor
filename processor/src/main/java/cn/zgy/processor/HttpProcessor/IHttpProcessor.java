package cn.zgy.processor.HttpProcessor;

import java.util.Map;

public interface IHttpProcessor {
    //网络访问：post get delete update put

    void post(String url, Map<String, Object> params, ICallback callback);

    void get(String url, Map<String, Object> params, ICallback callback);
}
