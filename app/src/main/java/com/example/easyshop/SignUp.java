package com.example.easyshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.easyshop.databinding.ActivitySignUpBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {

    ActivitySignUpBinding binding;
//    private FirebaseAuth auth;
//    FirebaseDatabase database;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Transparent Action Bar
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        // To hide toolbar
        getSupportActionBar().hide();

//        Initiaalize variables

//        auth = FirebaseAuth.getInstance();
//        database = FirebaseDatabase.getInstance();
        signUp = findViewById(R.id.signUp);


//        Creating an account

//        signUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                auth.createUserWithEmailAndPassword(binding.email.getText().toString(),binding.password.getText().toString());
//            }
//        });

    }
}