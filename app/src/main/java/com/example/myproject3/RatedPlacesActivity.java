package com.example.myproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RatedPlacesActivity extends AppCompatActivity {

    TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rated_places);

        // Get the positive and negative counts from the Intent


        // Set the text of the TextViews to the counts
         count = findViewById(R.id.count);
         //negativeCountTextView = findViewById(R.id.negative_count_textview);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {

            count.setText(bundle.getString("message"));
        }


        // Set up the ListView with the rated places
        // ...
    }

    // ...
}