package com.example.myproject3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    Button uno;
    Button dos;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the views by their ids


        uno = findViewById(R.id.login_button );
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the RatePlaceActivity when the "Rate a Place" card view is clicked
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });
        dos = findViewById(R.id.signup_button );
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the RatePlaceActivity when the "Rate a Place" card view is clicked
                Intent intent = new Intent(MainActivity.this, signup.class);
                startActivity(intent);
            }
        });
    }
}


