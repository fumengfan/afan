package com.example.phonesecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class updatePwActivity extends AppCompatActivity {

    EditText old_password,new_password,renew_password;
    Button update_pw;
    ImageView go_back_update_pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_pw);
        initUI();
        initClick();
    }

    private void initClick() {
        go_back_update_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(updatePwActivity.this,preventActivity.class);
                startActivity(intent);
            }
        });
        update_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initUI() {
        old_password=findViewById(R.id.old_password);
        new_password=findViewById(R.id.new_password);
        renew_password=findViewById(R.id.renew_password);
        update_pw=findViewById(R.id.update_pw);
        go_back_update_pw=findViewById(R.id.go_back_update_pw);
    }
}
