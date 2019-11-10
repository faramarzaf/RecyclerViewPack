package com.faramarz.tictacdev.recyclerview.simple_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.faramarz.tictacdev.recyclerview.R;

import java.util.ArrayList;

public class SimpleRecycler extends AppCompatActivity implements SimpleRecyclerViewAdapter.ItemClickListener {

    SimpleRecyclerViewAdapter adapter;
    RecyclerView recyclerView;
    ArrayList<String> animalNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_recycler);
        recyclerView = findViewById(R.id.rvAnimals);
        setRecyclerView();
        setData();
        setDivider();
    }

    private void setDivider() {
        recyclerView.addItemDecoration(new DividerItemDecoration(SimpleRecycler.this, DividerItemDecoration.VERTICAL));
    }

    private void setRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new SimpleRecyclerViewAdapter(this, animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }


    private void setData() {
        // data to populate the RecyclerView with
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");
        animalNames.add("Horse");
        animalNames.add("Cow");
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}

