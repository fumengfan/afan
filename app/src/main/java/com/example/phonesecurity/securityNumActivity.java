package com.example.phonesecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class securityNumActivity extends AppCompatActivity {
    ImageView security_num_prev,security_num_next;
    EditText security_num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_num);
        initUI();
        initClick();
        
    }

    private void initClick() {
        security_num_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(securityNumActivity.this,preventActivity.class);
                startActivity(intent);
            }
        });
        security_num_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(securityNumActivity.this,startActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initUI() {
        security_num_next=findViewById(R.id.security_num_next);
        security_num_prev=findViewById(R.id.security_num_prev);
        security_num=findViewById(R.id.security_num);
    }
}
