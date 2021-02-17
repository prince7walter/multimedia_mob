package com.miagae.multimedia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout activity_main;
    private ActionBarDrawerToggle toggle;
    private NavigationView navView ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main= findViewById(R.id.activity_main);
        toggle = new ActionBarDrawerToggle(this,activity_main,R.string.open,R.string.close);
        activity_main.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navView = findViewById(R.id.navView);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.classe:
                        System.out.println("hh");
                    case R.id.etudiant:
                        Toast.makeText(MainActivity.this, "etudiant chose", Toast.LENGTH_SHORT).show();
                    case R.id.mail:
                        Toast.makeText(MainActivity.this, "main chose", Toast.LENGTH_SHORT).show();
                    case R.id.sms:
                        Toast.makeText(MainActivity.this, "sms chose", Toast.LENGTH_SHORT).show();
                    default:return true;
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}