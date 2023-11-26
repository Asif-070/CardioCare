package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DELAY = 1000; // 1 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Use a Handler to delay the transition to the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the next activity here (replace MainActivity.class with your desired activity)
//                Intent intent = new Intent(SplashActivity.this, EmergencyActivity.class);
//                startActivity(intent);
                Intent intent = new Intent(SplashActivity.this, StartedActivity.class);
                startActivity(intent);
                finish(); // Finish this activity to prevent the user from going back
            }
        }, SPLASH_DELAY);
    }
}
