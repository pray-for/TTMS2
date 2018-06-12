package com.example.zhangjiawen.ttms2.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.zhangjiawen.ttms2.R;

/**
 * Created by zhangjiawen on 2018/6/11.
 */

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    private static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
        initEvent();

    }

    public void initView(){
        btn = (Button) findViewById(R.id.btn);
    }

    public void initEvent(){
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                Intent intent = new Intent();
                intent.setClass(SplashActivity.this , MainActivity.class);
                startActivity(intent);
        }
    }
}
