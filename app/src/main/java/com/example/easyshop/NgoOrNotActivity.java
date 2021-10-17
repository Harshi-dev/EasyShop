package com.example.easyshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NgoOrNotActivity extends AppCompatActivity {

    Button ngo;
    Button nonNgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_or_not);


        // To hide toolbar
        getSupportActionBar().hide();

        ngo = findViewById(R.id.NGO);
        nonNgo = findViewById(R.id.notNgo);

        ngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NgoOrNotActivity.this, NgoSignUpActivity.class);
                startActivity(intent);

            }
        });

        nonNgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NgoOrNotActivity.this, SignUp.class);
                startActivity(intent);
            }
        });

    }
}