package com.example.quickeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignIn extends AppCompatActivity {
    Button SignUpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        SignUpbtn = findViewById(R.id.SignUpbtn);

        SignUpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click;
                click = new Intent(SignIn.this, HomePage.class);
                startActivity(click);

            }
        });

    }
}