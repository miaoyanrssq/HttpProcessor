package cn.zgy.processor.HttpProcessor;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


public abstract class HttpCallback<Result> implements ICallback {

    @Override
    public void onSuccess(String result) {
        Gson gson = new Gson();
        Class<?> clz = analysisClassInfo(this);
        Result objResult = (Result) gson.fromJson(result, clz);

        onSuccess(objResult);
    }

    public abstract void onSuccess(Result result);


    /**
     * 通过反射的方式获取Class类型
     * @param object
     * @return
     */
    public static Class<?> analysisClassInfo(Object object){
        Type genType = object.getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
        return (Class<?>) params[0];
    }
}
