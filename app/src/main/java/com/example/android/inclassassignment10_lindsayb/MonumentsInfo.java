package com.example.android.inclassassignment10_lindsayb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MonumentsInfo extends AppCompatActivity {

    ImageView image;
    TextView name;
    TextView location;
    TextView displayText;
    String savedText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments_info);

        image = (ImageView) findViewById(R.id.monument_photo);
        name = (TextView) findViewById(R.id.monument_name);
        location = (TextView) findViewById(R.id.monument_info);

        Intent intent = getIntent();
        Monuments m = (Monuments) intent.getSerializableExtra(KEYS.MONUMENTS);

//            m.getName().toString();
//            m.getInfo().toString();
//            m.getPhotoId();

        //displayText = (TextView) findViewById(R.id.display_text);
//            savedText = displayText.getText().toString();


        //displayText.setText((m.getName().toString()) + "\n" + m.getInfo().toString() + "\n");
        image.setImageResource(m.getPhotoId());
        name.setText(m.getName());
        location.setText(m.getInfo());

    }
}

