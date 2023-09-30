package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText tieEmail,tiePassword;
    private TextView tvSignUp,tvForgot;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findAllViews();

        setClickListener();
    }


    private void setClickListener(){
        tvSignUp.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this,SignUpActivity.class)));
        tvForgot.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this,ForgotActivity.class)));

        buttonLogin.setOnClickListener((View v)->{
            String email = String.valueOf( tieEmail.getText() );
            String pass = String.valueOf( tiePassword.getText() );
            Toast.makeText(this, email+" "+pass, Toast.LENGTH_SHORT).show();
            // todo database
            Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
            startActivity(intent);
            finish();
        });

    }

    private void findAllViews(){

        tieEmail = findViewById(R.id.tieEmail);
        tiePassword = findViewById(R.id.tiePassword);
        tvSignUp = findViewById(R.id.tvSignup);
        tvForgot = findViewById(R.id.tvForgot);
        buttonLogin = findViewById(R.id.buttonLogin);
    }


}
