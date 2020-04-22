package com.example.phonesecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;

public class MainActivity extends AppCompatActivity {


    TextView forgetPw,i_register;
    Button login;
    RelativeLayout root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化UI,定义id
        initUI();
        //初始化动画
        initAnimation();
        //触发操作
        initClick();

        //数据
        initData();
    }

    private void initData() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText user,password;
                user=findViewById(R.id.user);
                password=findViewById(R.id.password);
                String username=user.getText().toString().trim();
                Intent intent=new Intent(MainActivity.this,preventActivity.class);
                startActivity(intent);

            }
        });
    }

    private void initClick() {
        forgetPw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ForgetPwActivity.class);
            startActivity(intent);
            }
        });
       i_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,registerActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initAnimation() {
        AlphaAnimation alphaAnimation=new AlphaAnimation(0,1);//透明度
        alphaAnimation.setDuration(1000);
        root.startAnimation(alphaAnimation);
    }

    private void initUI() {

        forgetPw=findViewById(R.id.forgetPw);
        i_register=findViewById(R.id.i_register);
        login=findViewById(R.id.login);
        root=findViewById(R.id.root);
    }
}
