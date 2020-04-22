package com.example.phonesecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startActivity extends AppCompatActivity {
        Button start_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initUI();
        initClick();
    }

    private void initClick() {
        start_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(startActivity.this, preventActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initUI() {
        start_next=findViewById(R.id.start_next);
    }
}
