package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DisCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_card);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<medicine_item> items = new ArrayList<medicine_item>();

        items.add(new medicine_item("Headache"," Headaches are often caused by various factors, such as tension or migraines. They result in pain and discomfort in the head.","Aspirin (Acetylsalicylic acid)"));
        items.add(new medicine_item("Headache"," Headaches are often caused by various factors, such as tension or migraines. They result in pain and discomfort in the head.","Aspirin (Acetylsalicylic acid)" +
                "Headaches are often caused by various factors, such as tension or migraines. They result in pain and discomfort in the head.\",\"Aspirin (Acetylsalicylic acid)" +
                "Headaches are often caused by various factors, such as tension or migraines. They result in pain and discomfort in the head.\",\"Aspirin (Acetylsalicylic acid)"));
        items.add(new medicine_item("Headache"," Headaches are often caused by various factors, such as tension or migraines. They result in pain and discomfort in the head.","Aspirin (Acetylsalicylic acid)"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new medicinie_adapter(getApplicationContext(),items));
    }
}