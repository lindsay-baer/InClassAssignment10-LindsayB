package com.example.android.inclassassignment10_lindsayb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Monuments> monuments;
    private MonumentsAdapter monumentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        monumentsAdapter = new MonumentsAdapter(monuments, this);
        recyclerView.setAdapter(monumentsAdapter);
    }

    public void addRandomMonument(View view) {
        monuments.add(getRandomMonument());
        monumentsAdapter.notifyDataSetChanged();
    }

    private void initialData() {
        monuments = new ArrayList<>();
        monuments.add(new Monuments("Taj Mahal", "Agra, India", R.drawable.tajmahal));
        monuments.add(new Monuments("Gateway Arch", "St. Louis, MO", R.drawable.stlouisarch));
        monuments.add(new Monuments("Colosseum", "Rome, Italy", R.drawable.colosseum));
    }

    private Monuments getRandomMonument() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Monuments("Taj Mahal", "Agra, India", R.drawable.tajmahal);
        else if (num == 1)
            return new Monuments("Gateway Arch", "St. Louis, MO", R.drawable.stlouisarch);
        else
            return new Monuments("Colosseum", "Rome, Italy", R.drawable.colosseum);
    }
}