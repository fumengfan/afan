package com.example.phonesecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class functionActivity extends AppCompatActivity {

    Button lock,uninstall,clear_data,location;
    ImageView go_back_function;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);
//初始化界面
        initUI();
        //触发操作
        initClick();
    }

    private void initClick() {
        lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        uninstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        clear_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(functionActivity.this,locateActivity.class);
            startActivity(intent);
            }
        });
        go_back_function.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent=new Intent(functionActivity.this,preventNumActivity.class);
            startActivity(intent);
            }
        });
    }

    private void initUI() {
        lock=findViewById(R.id.lock);
        uninstall=findViewById(R.id.uninstall);
        clear_data=findViewById(R.id.clear_data);
        location=findViewById(R.id.location);
        go_back_function=findViewById(R.id.go_back_function);
    }
}
