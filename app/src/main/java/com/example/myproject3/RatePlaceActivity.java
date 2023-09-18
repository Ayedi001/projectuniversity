package com.example.myproject3;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class RatePlaceActivity extends AppCompatActivity {

         int positiveCount = 0;
         int negativeCount = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_rate_place );

            // Find the buttons in the layout
            Button positiveButton = findViewById(R.id.positive_button);
            Button negativeButton = findViewById(R.id.negative_button);

            // Set click listeners for the buttons
            positiveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    positiveCount++;
                    Toast.makeText(RatePlaceActivity.this, "Positive count: " + positiveCount, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RatePlaceActivity.this, RatedPlacesActivity.class);

                    String a= String.valueOf(positiveCount);

// Add data to the Intent object
                    intent.putExtra("message", a);

// Start the new activity with the Intent object
                    startActivity(intent);

                }
            });

            negativeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    negativeCount++;
                    Toast.makeText(RatePlaceActivity.this, "Negative count: " + negativeCount, Toast.LENGTH_SHORT).show();
                }
            });


        }

        @Override
        public void onBackPressed() {
            // Pass the positiveCount and negativeCount variables back to the MainActivity
            Intent intent = new Intent();
            intent.putExtra("positiveCount", positiveCount);
            intent.putExtra("negativeCount", negativeCount);
            setResult(RESULT_OK, intent);
            super.onBackPressed();
        }
    }
