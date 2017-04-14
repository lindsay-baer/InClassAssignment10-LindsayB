package com.example.android.inclassassignment10_lindsayb;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MonumentsAdapter extends RecyclerView.Adapter<MonumentViewHolder> {

    private List<Monuments> monuments;
    private Context context;

    public MonumentsAdapter(List<Monuments> monuments, Context context) {
        this.monuments = monuments;
        this.context = context;
    }

    @Override
    public MonumentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_monument, parent, false);
        return new MonumentViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(MonumentViewHolder holder, int position) {
        Monuments monument = monuments.get(position);
        holder.bind(monument);
    }

    @Override
    public int getItemCount() {
        return monuments.size();
    }
}