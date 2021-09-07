package com.example.last;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnJ1;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:

                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.nav_news:
                        Intent intent1 = new Intent(MainActivity.this, News.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_help:
                        Intent intent2 = new Intent(MainActivity.this, Help.class);
                        startActivity(intent2);
                        break;
                    case R.id.nav_hotlines:
                        Intent intent3 = new Intent(MainActivity.this, Hotlines.class);
                        startActivity(intent3);
                        break;
                    case R.id.nav_checklist:
                        Intent intent4 = new Intent(MainActivity.this, Checklist.class);
                        startActivity(intent4);
                        break;


//Paste your privacy policy link

//                     case  R.id.nav_Policy:{
//
//                        Intent browserIntent  = new Intent(Intent.ACTION_VIEW , Uri.parse(""));
//                        startActivity(browserIntent);
//
//                    }
                    //       break;
                    case R.id.nav_share: {

                        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        String shareBody = "http://play.google.com/store/apps/detail?id=" + getPackageName();
                        String shareSub = "Try now";
                        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                        startActivity(Intent.createChooser(sharingIntent, "Share using"));

                    }
                    break;
                }
                return false;
            }
        });
    }

    public void setUpToolbar() {
        drawerLayout = findViewById(R.id.drawerLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


    }


    public void kathleen(View view) {
        if (view.getId() == R.id.btn1) {

            Intent intent = new Intent(MainActivity.this, Earthquake.class);
            startActivity(intent);
        }
       else if (view.getId() == R.id.btn2) {

            Intent intent = new Intent(MainActivity.this, Landslide.class);
            startActivity(intent);
        }
       else if (view.getId() == R.id.btn3) {

            Intent intent = new Intent(MainActivity.this, Typhoon.class);
            startActivity(intent);
        }
       else if (view.getId() == R.id.btn4) {

            Intent intent = new Intent(MainActivity.this, VolcanicEruption.class);
            startActivity(intent);
        }
       else if (view.getId() == R.id.btn5) {

            Intent intent = new Intent(MainActivity.this, Fire.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.btn6) {

            Intent intent = new Intent(MainActivity.this, Flood.class);
            startActivity(intent);
        }
    }
}
