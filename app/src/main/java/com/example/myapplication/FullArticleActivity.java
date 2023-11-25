package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FullArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_article);

        TextView textView = findViewById(R.id.textView);
        TextView art = findViewById(R.id.art);

        // Get the article number sent from ArticleActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int articleNumber = extras.getInt("ARTICLE_NUMBER");

            // Set the title and content for the corresponding article number
            switch (articleNumber) {
                case 1:
                    textView.setText("Research Article 1");
                    art.setText("getString(R.string.article_1)"); // Replace R.string.article_1 with your string resource
                    break;
                case 2:
                    textView.setText("Research Article 2");
                    art.setText("getString(R.string.article_2)"); // Replace R.string.article_2 with your string resource
                    break;
                case 3:
                    textView.setText("Research Article 3");
                    art.setText("getString(R.string.article_3)"); // Replace R.string.article_1 with your string resource
                    break;
                case 4:
                    textView.setText("Research Article 4");
                    art.setText("getString(R.string.article_4)"); // Replace R.string.article_2 with your string resource
                    break;
                case 5:
                    textView.setText("Research Article 5");
                    art.setText("getString(R.string.article_5)"); // Replace R.string.article_1 with your string resource
                    break;
                default:
                    break;
            }
        }
    }
}
