package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ForgotActivity extends AppCompatActivity {

    private Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

        b1 = findViewById(R.id.buttonLogin);
        b2 = findViewById(R.id.buttonLogin2);

        b2.setOnClickListener(v -> finish());

    }
}