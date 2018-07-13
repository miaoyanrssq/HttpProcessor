package cn.zgy.httpprocessor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import cn.zgy.processor.HttpHelper;
import cn.zgy.processor.HttpProcessor.HttpCallback;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL="https://testmediaadmin.8531.cn/login";
    Map<String, Object> params = new HashMap<>();
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView  = (TextView) findViewById(R.id.text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test();
            }
        });
    }

    private void test() {
        params.put("username", "huangqinmei");
        params.put("password", encode("12345678"));
        HttpHelper.obtain().post(BASE_URL, params, new HttpCallback<Entity>() {
            @Override
            public void onFail(String e) {
                Log.e("网络失败", e.toString());
            }

            @Override
            public void onSuccess(Entity entity) {
                Log.e("TGA", entity.toString());
            }
        });
    }




    /**
     * 加密登录参数
     *
     * @param password
     */
    private String encode(String password) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (int i = 0; i < password.length(); i++) {
                String item = password.charAt(i) + "";
                String output = URLEncoder.encode(item.trim(), "UTF-8");
                if (output.equals(item)) {
                    output = Integer.toHexString(password.charAt(i));
                }
                stringBuilder.append(output);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        password = stringBuilder.toString().replaceAll("\\%", "").toUpperCase();
        return password;
    }
}
