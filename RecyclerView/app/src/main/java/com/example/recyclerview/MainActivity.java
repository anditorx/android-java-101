package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<RCModel> modelArrayList;
    RCAdapter rcAdapter;

    String[] title = new String[]{
           "Argentina",
           "Bahrain",
           "China",
           "Croatia",
           "Germany",
           "India",
           "Indonesia",
           "Italy",
           "Japan",
           "Marocco",
            "Moldova",
            "Palestine",
            "Portugal",
            "Qatar",
            "Saudi Arabia",
            "Thailand",
            "Turkey",
            "Uni Emirate Arab"
    };

    int[] image = new int[]{
            R.drawable.img_argentina, R.drawable.img_bahrain,R.drawable.img_china, R.drawable.img_croatia,
            R.drawable.img_germany, R.drawable.img_india, R.drawable.img_indonesia, R.drawable.img_italy,
            R.drawable.img_japan, R.drawable.img_marocco, R.drawable.img_moldova, R.drawable.img_palestine,
            R.drawable.img_portugal, R.drawable.img_qatar, R.drawable.img_saudi,
            R.drawable.img_thailand, R.drawable.img_turkey, R.drawable.img_uea
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Recycler View");

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        modelArrayList = new ArrayList<>();
        rcAdapter = new RCAdapter(this, modelArrayList);
        recyclerView.setAdapter(rcAdapter);

        for (int i = 0; i < title.length; i++) {
            RCModel rcModel = new RCModel(title[i], image[i]);
            modelArrayList.add(rcModel);
        }
        rcAdapter.notifyDataSetChanged();

    }
}