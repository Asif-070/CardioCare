package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PredictActivity extends AppCompatActivity {

    private EditText answer1EditText, answer4EditText, answer5EditText, answer8EditText, answer9EditText;
    private RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5;
    private Button submitButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predict);

        // Initialize Views
        answer1EditText = findViewById(R.id.answer1EditText);
        answer4EditText = findViewById(R.id.answer4EditText);
        answer5EditText = findViewById(R.id.answer5EditText);
        answer8EditText = findViewById(R.id.answer8EditText);
        answer9EditText = findViewById(R.id.answer9EditText);

        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup5 = findViewById(R.id.radioGroup5);

        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get answers
                String answer1 = answer1EditText.getText().toString();
                String answer4 = answer4EditText.getText().toString();
                String answer5 = answer5EditText.getText().toString();
                String answer8 = answer8EditText.getText().toString();
                String answer9 = answer9EditText.getText().toString();

                int selectedRadioId1 = radioGroup1.getCheckedRadioButtonId();
                RadioButton selectedRadio1 = findViewById(selectedRadioId1);
                String answer2 = (selectedRadio1 != null) ? selectedRadio1.getText().toString() : "";

                int selectedRadioId2 = radioGroup2.getCheckedRadioButtonId();
                RadioButton selectedRadio2 = findViewById(selectedRadioId2);
                String answer3 = (selectedRadio2 != null) ? selectedRadio2.getText().toString() : "";

                int selectedRadioId3 = radioGroup3.getCheckedRadioButtonId();
                RadioButton selectedRadio3 = findViewById(selectedRadioId3);
                String answer6 = (selectedRadio3 != null) ? selectedRadio3.getText().toString() : "";

                int selectedRadioId4 = radioGroup4.getCheckedRadioButtonId();
                RadioButton selectedRadio4 = findViewById(selectedRadioId4);
                String answer7 = (selectedRadio4 != null) ? selectedRadio4.getText().toString() : "";

                int selectedRadioId5 = radioGroup5.getCheckedRadioButtonId();
                RadioButton selectedRadio5 = findViewById(selectedRadioId5);
                String answer10 = (selectedRadio5 != null) ? selectedRadio5.getText().toString() : "";

                // Check if any answer is empty
                if (answer1.isEmpty() || answer2.isEmpty() || answer3.isEmpty() ||
                        answer4.isEmpty() || answer5.isEmpty() ||
                        answer6.isEmpty() || answer7.isEmpty() || answer8.isEmpty() || answer9.isEmpty() || answer10.isEmpty()) {

                    // Display alert dialog as Toast
                    Toast.makeText(PredictActivity.this, "Please answer all questions.", Toast.LENGTH_SHORT).show();

                } else {
                    // Pass answers to ResultsActivity
                    Intent intent = new Intent(PredictActivity.this, ResultActivity.class);
                    intent.putExtra("Answer1", answer1);
                    intent.putExtra("Answer2", answer2);
                    intent.putExtra("Answer3", answer3);
                    intent.putExtra("Answer4", answer4);
                    intent.putExtra("Answer5", answer5);
                    intent.putExtra("Answer6", answer6);
                    intent.putExtra("Answer7", answer7);
                    intent.putExtra("Answer8", answer8);
                    intent.putExtra("Answer9", answer9);
                    intent.putExtra("Answer10", answer10);

                    startActivity(intent);
                }
            }
        });

    }
}
