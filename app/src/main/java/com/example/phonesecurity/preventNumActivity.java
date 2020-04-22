package com.example.phonesecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class preventNumActivity extends AppCompatActivity {

    ImageView prevent_num_prev,prevent_num_next;
    EditText prevent_num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevent_num);
        initUI();
        initClick();
    }

    private void initClick() {
        prevent_num_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(preventNumActivity.this,preventActivity.class);
                startActivity(intent);
            }
        });
        prevent_num_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(preventNumActivity.this,functionActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initUI() {
        prevent_num_next=findViewById(R.id.prevent_num_next);
        prevent_num_prev=findViewById(R.id.prevent_num_prev);
        prevent_num=findViewById(R.id.prevent_num);
    }
}
