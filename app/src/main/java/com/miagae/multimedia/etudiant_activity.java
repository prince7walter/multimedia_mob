package com.miagae.multimedia;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class etudiant_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("ETUDIANTS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
