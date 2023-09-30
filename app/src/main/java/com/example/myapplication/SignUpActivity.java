package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends AppCompatActivity {

    private TextView tvLogin;
    private TextInputEditText tieName,tieEmail,tiePassword,tieConfirmPassword;
    private Button buttonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findAllViews();

        setClickListener();

    }

    private void setClickListener(){
        tvLogin.setOnClickListener((View v)-> finish());

        buttonSignup.setOnClickListener((View v)->{
            String name = String.valueOf( tieName.getText() );
            String email = String.valueOf( tieEmail.getText() );
            String pass = String.valueOf( tiePassword.getText() );
            String confirmPass = String.valueOf( tieConfirmPassword.getText() );

            Intent intent = new Intent(SignUpActivity.this, ConfirmActivity.class);
            startActivity(intent);
            finish();
//            Toast.makeText(this, email+" "+name+"\n"+pass, Toast.LENGTH_SHORT).show();
            // todo database
        });
    }

    private void findAllViews(){
        tieName = findViewById(R.id.tieName);
        tieEmail = findViewById(R.id.tieEmail);
        tiePassword = findViewById(R.id.tiePassword);
        tieConfirmPassword = findViewById(R.id.tieConfirmPassword);
        buttonSignup = findViewById(R.id.buttonRegister);
        tvLogin = findViewById(R.id.tvLogin);

    }


}
