package com.example.kafews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SafeHavens extends AppCompatActivity {

    ArrayList<ContactModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe_havens);

        RecyclerView recyclerView = findViewById(R.id.recyclerp);
        recyclerView.setLayoutManager(new LinearLayoutManager(SafeHavens.this));

        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));
        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));
        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));
        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));
        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));
        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));
        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));
        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));
        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));
        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));
        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));
        list.add(new ContactModel(R.drawable.safe, "Nyakasura School", "0765819111"));

        ContactAdapter adapter = new ContactAdapter(SafeHavens.this, list);
        recyclerView.setAdapter(adapter);

    }
}