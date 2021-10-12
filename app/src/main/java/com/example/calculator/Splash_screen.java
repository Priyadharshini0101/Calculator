package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_screen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        int splash_screen_length = 1000;
        new Handler().postDelayed(() -> {
            Log.v("Mainactivity","Dilse");
     Intent i=new Intent(Splash_screen.this,MainActivity.class);
     Splash_screen.this.startActivity(i);
     Splash_screen.this.finish();
        }, splash_screen_length);
    }
}