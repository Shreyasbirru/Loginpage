package com.example.quickeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInactivity extends AppCompatActivity {
    Button LoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_inactivity);
        LoginBtn = findViewById(R.id.LoginBtn);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click;
                click = new Intent(LogInactivity.this, HomePage.class);
                startActivity(click);
            }
        });
    }
}
