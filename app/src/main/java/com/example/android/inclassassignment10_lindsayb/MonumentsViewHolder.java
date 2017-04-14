package com.example.android.inclassassignment10_lindsayb;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MonumentViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView monumentNameView;
    private TextView monumentInfoView;
    private ImageView monumentPhotoView;
    private Context context;

    //activity inherits from context
    public MonumentViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        monumentNameView = (TextView) itemView.findViewById(R.id.monument__name);
        monumentInfoView = (TextView) itemView.findViewById(R.id.monument_info);
        monumentPhotoView = (ImageView) itemView.findViewById(R.id.monument__photo);
        this.context = context;
    }

    //swaps out the images, similar to rotator
    public void bind(final Monuments monuments) {
        monumentNameView.setText(monuments.name);
        monumentInfoView.setText(monuments.info);
        monumentPhotoView.setImageResource(monuments.photoId);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Monuments m = new Monuments(monuments.name, monuments.info, monuments.photoId);
                Intent monumentIntent = new Intent(context, MonumentsInfo.class);
                monumentIntent.putExtra(KEYS.MONUMENTS, m);
                context.startActivity(monumentIntent);

                Toast.makeText(context, monumentNameView.getText(), Toast.LENGTH_SHORT).show();


            }
        });
    }
}