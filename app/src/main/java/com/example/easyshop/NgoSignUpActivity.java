package com.example.easyshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NgoSignUpActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_sign_up);


        // To hide toolbar
        getSupportActionBar().hide();
    }
}