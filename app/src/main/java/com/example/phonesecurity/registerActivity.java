package com.example.phonesecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class registerActivity extends AppCompatActivity {

    EditText sec_password,fir_password,username,phone_number,check_in;
    Button check,register;
    ImageView go_back_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initUI();
        initClick();

    }

    private void initClick() {
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(registerActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        go_back_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(registerActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initUI() {
        sec_password=findViewById(R.id.sec_password);
       fir_password= findViewById(R.id.fir_password);
        username=findViewById(R.id.username);
        phone_number=findViewById(R.id.phone_number);
        check_in=findViewById(R.id.check_in);
         check=findViewById(R.id.check);
         register=findViewById(R.id.register);
         go_back_register=findViewById(R.id.go_back_register);
    }
}
