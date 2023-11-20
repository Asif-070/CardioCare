package com.example.myapplication;

// Import necessary packages
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Get intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // Retrieve answers from intent
            String answer1 = extras.getString("Answer1", "");
            String answer2 = extras.getString("Answer2", "");
            String answer3 = extras.getString("Answer3", "");
            String answer4 = extras.getString("Answer4", "");
            String answer5 = extras.getString("Answer5", "");
            String answer6 = extras.getString("Answer6", "");
            String answer7 = extras.getString("Answer7", "");
            String answer8 = extras.getString("Answer8", "");
            String answer9 = extras.getString("Answer9", "");
            String answer10 = extras.getString("Answer10", "");

            // Display answers in TextViews
            TextView result1TextView = findViewById(R.id.result1TextView);
            result1TextView.setText("Q1: " + answer1);

            TextView result2TextView = findViewById(R.id.result2TextView);
            result2TextView.setText("Q2: " + answer2);

            TextView result3TextView = findViewById(R.id.result3TextView);
            result3TextView.setText("Q3: " + answer3);

            TextView result4TextView = findViewById(R.id.result4TextView);
            result4TextView.setText("Q4: " + answer4);

            TextView result5TextView = findViewById(R.id.result5TextView);
            result5TextView.setText("Q5: " + answer5);

            TextView result6TextView = findViewById(R.id.result6TextView);
            result6TextView.setText("Q6: " + answer6);

            TextView result7TextView = findViewById(R.id.result7TextView);
            result7TextView.setText("Q7: " + answer7);

            TextView result8TextView = findViewById(R.id.result8TextView);
            result8TextView.setText("Q8: " + answer8);

            TextView result9TextView = findViewById(R.id.result9TextView);
            result9TextView.setText("Q9: " + answer9);

            TextView result10TextView = findViewById(R.id.result10TextView);
            result10TextView.setText("Q10: " + answer10);

            // OK button
            Button okButton = findViewById(R.id.okbutton);
            okButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Navigate to another activity with back button disabled
                    Intent intent = new Intent(ResultActivity.this, MenuActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }
}
