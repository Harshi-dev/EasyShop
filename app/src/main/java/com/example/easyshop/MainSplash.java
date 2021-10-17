package com.example.easyshop;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class MainSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);

        // Transparent Action Bar
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        // To hide toolbar
        getSupportActionBar().hide();

        // Setting timing for splash screen and moving to next activity
        Thread thread = new Thread(){
            public void run(){
                try{
                     sleep(4000);
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(MainSplash.this, MainActivity.class);
                    startActivity(intent);

                }
            }
        };thread.start();

    }

}