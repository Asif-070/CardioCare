package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class FAQActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    faq_adapter adapter;
    List<faq_item> items = new ArrayList<faq_item>();
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqactivity);

        recyclerView = findViewById(R.id.recyclerViewFAQ);
        adapter = new faq_adapter(this, items);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterText(newText);
                return true;
            }
        });

        items.add(new faq_item("Aspirin","Pain relief, anti-inflammatory, and anti-fever."));
        items.add(new faq_item("Paracetamol","Pain relief and fever reduction"));
        items.add(new faq_item("Zantac","Heartburn and acid indigestion"));
        items.add(new faq_item("Metformin","Type 2 diabetes management"));
        items.add(new faq_item("Effexor","Treatment of depression and anxiety disorders"));
        items.add(new faq_item("Cipro","Antibiotic for bacterial infections"));
        items.add(new faq_item("Toprol XL","High blood pressure and angina"));
        items.add(new faq_item("Nexium","Gastroesophageal reflux disease (GERD)"));
        items.add(new faq_item("Loratadine","Allergy relief"));

        adapter.notifyDataSetChanged();
    }

    private void filterText(String text) {
        ArrayList<faq_item> filteredList = new ArrayList<>();

        for (faq_item faqItem : items) {
            if (faqItem.getQues().toLowerCase().contains(text.toLowerCase()) || faqItem.getAns().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(faqItem);
            }
        }

        adapter.setSearchList(filteredList); // Set the filtered list to the adapter
    }

}