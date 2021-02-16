package com.miagae.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
public class SplashScrennActivity extends AppCompatActivity {

    private final int timeOut=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screnn);

        //redirection
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
              //page de redirection
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        //le delais de redirection
        new Handler().postDelayed(runnable,timeOut);
    }
}