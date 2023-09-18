package com.example.myproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {
    private Button uno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);




                uno = findViewById(R.id.signup_button );
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the RatePlaceActivity when the "Rate a Place" card view is clicked
                Intent intent = new Intent(signup.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}