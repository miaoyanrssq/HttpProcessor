package cn.zgy.processor;

import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import cn.zgy.processor.HttpProcessor.ICallback;
import cn.zgy.processor.HttpProcessor.IHttpProcessor;

/**
* 代理
* @author zhengy
* create at 2018/7/13 下午2:39
**/
public class HttpHelper implements IHttpProcessor{
    private static IHttpProcessor mIHttpProcessor = null;
    private Map<String, Object> mParams;
    private static HttpHelper _instance;

    private HttpHelper(){
        mParams = new HashMap<>();
    }

    public static HttpHelper obtain(){
        synchronized (HttpHelper.class){
            if(_instance == null){
                _instance = new HttpHelper();
            }
        }

        return _instance;
    }


    public static void init(IHttpProcessor httpProcessor){
        mIHttpProcessor = httpProcessor;
    }



    @Override
    public void post(String url, Map<String, Object> params, ICallback callback) {
        mIHttpProcessor.post(url, params, callback);
    }



    @Override
    public void get(String url, Map<String, Object> params, ICallback callback) {
        mIHttpProcessor.get(url, params, callback);
    }



}
