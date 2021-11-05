package com.example.calculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlayout);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Data()).addToBackStack(null)
                .commit();
    }
}
