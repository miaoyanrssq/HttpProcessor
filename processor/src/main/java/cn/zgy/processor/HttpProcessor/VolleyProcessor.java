package cn.zgy.processor.HttpProcessor;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
/**
* volley 请求
* @author zhengy
* create at 2018/7/13 上午11:23
**/
public class VolleyProcessor implements IHttpProcessor{

    private static RequestQueue mQueue = null;

    public VolleyProcessor(Context context) {
        mQueue = Volley.newRequestQueue(context);
    }

    @Override
    public void post(String url, Map<String, Object> params, final ICallback callback) {
        final String finalUrl = appendParams(url, params);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, finalUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                callback.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                callback.onFail(error.toString());
            }
        });

        mQueue.add(stringRequest);
    }

    @Override
    public void get(String url, Map<String, Object> params, final ICallback callback) {
        final String finalUrl = appendParams(url, params);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, finalUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                callback.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                callback.onFail(error.toString());
            }
        });

        mQueue.add(stringRequest);
    }


    /**
     * 合并url和params
     * @param url
     * @param params
     * @return
     */
    private String appendParams(String url, Map<String, Object> params) {
        if(params == null || params.isEmpty()){
            return url;
        }

        StringBuilder urlBuilder = new StringBuilder(url);
        for(Map.Entry<String , Object> entry : params.entrySet()){
            if(urlBuilder.indexOf("?") < 0){
                urlBuilder.append("?");
            }else{
                if(!urlBuilder.toString().endsWith("?")){
                    urlBuilder.append("&");
                }
            }
            urlBuilder.append(entry.getKey()).append("=").append(encode(entry.getValue().toString()));
        }

        Log.e("TGA", urlBuilder.toString());
        return urlBuilder.toString();
    }

    private static String encode(String str){
        try {
            return URLEncoder.encode(str, "utf-8");
        }catch (UnsupportedEncodingException e){
            Log.e("参数转码异常", e.toString());
            throw new RuntimeException(e);
        }
    }
}
