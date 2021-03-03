package com.rku_18fotca11002.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.json.JSONArray;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String [] nameList = {"Fenil", "Babariya", "18FOTCa11002", "RK University", "Fenil", "Babariya", "18FOTCa11002", "RK University","Fenil", "Babariya", "18FOTCa11002", "RK University", "Fenil", "Babariya", "18FOTCa11002", "RK University"};
    String [] descriptionList = {"Name", "Surname", "Enrollment No", "University Name", "Name", "Surname", "Enrollment No", "University Name", "Name", "Surname", "Enrollment No", "University Name", "Name", "Surname", "Enrollment No", "University Name"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(this, nameList, descriptionList);
        recyclerView.setAdapter(adapter);

    }
}