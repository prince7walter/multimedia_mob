package com.miagae.multimedia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class classe_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("CLASSES");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
