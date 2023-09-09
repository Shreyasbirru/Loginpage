package com.example.quickeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button LogIn ,SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogIn = findViewById(R.id.LogIn);
        SignIn = findViewById(R.id.SignIn);
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click;
                click = new Intent(MainActivity.this,LogInactivity.class);
                startActivity(click);
            }
        });
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click;
                click = new Intent(MainActivity.this,SignIn.class);
                startActivity(click);
            }
        });
    }
}