package cn.zgy.httpprocessor;

import android.app.Application;

import cn.zgy.processor.HttpHelper;
import cn.zgy.processor.HttpProcessor.OkHttpProcessor;
import cn.zgy.processor.HttpProcessor.VolleyProcessor;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        HttpHelper.init(new VolleyProcessor(this));
        HttpHelper.init(new OkHttpProcessor());
    }
}
