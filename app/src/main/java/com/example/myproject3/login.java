package com.example.myproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class login extends AppCompatActivity {
    private ImageView uno;
    private ImageView dos;
    private ImageView tres;

    private ImageView emer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        uno = findViewById(R.id.rate_place_cardview);
        dos = findViewById(R.id.rated_places_cardview);
        tres = findViewById(R.id.people_around_you_cardview);
        emer = findViewById(R.id.emergency);

        // Set click listeners for the card views
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the RatePlaceActivity when the "Rate a Place" card view is clicked
                Intent intent = new Intent(login.this, RatePlaceActivity.class);
                startActivity(intent);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the PeopleAroundYouActivity when the "People Around You" card view is clicked
                Intent intent = new Intent(login.this, PeopleAroundYouActivity.class);
                startActivity(intent);
            }
        });
        emer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the PeopleAroundYouActivity when the "People Around You" card view is clicked
                Intent intent = new Intent(login.this, Emergencycalling.class);
                startActivity(intent);
            }
        });




    }
}