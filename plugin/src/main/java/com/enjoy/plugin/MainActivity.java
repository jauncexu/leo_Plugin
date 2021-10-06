package com.enjoy.plugin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 暂时注释，没涉及到资源
//        setContentView(R.layout.activity_main);
        Log.e("leo", "onCreate: 启动插件的Activity");
    }
}
