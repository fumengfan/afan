package com.example.phonesecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class preventActivity extends AppCompatActivity {
    Switch anti_theft_turn;
    Button turn_on_prevent,update_password;
    ImageView prevent_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevent);
        initUI();
        initClick();
    }

    private void initClick() {
        anti_theft_turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        turn_on_prevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(preventActivity.this,preventNumActivity.class);
                startActivity(intent);
            }
        });
        update_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(preventActivity.this,updatePwActivity.class);
                startActivity(intent);
            }
        });
        prevent_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(preventActivity.this,securityNumActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initUI() {
        anti_theft_turn=findViewById(R.id.anti_theft_turn);
        turn_on_prevent=findViewById(R.id.turn_on_prevent);
        update_password=findViewById(R.id.update_password);
        prevent_next=findViewById(R.id.prevent_next);
    }
}
