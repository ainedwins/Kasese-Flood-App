package com.example.kafews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cdSafe;
    CardView cdWetha;
    CardView cdFor;
    CardView cdInf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cdFor = findViewById(R.id.cardForum);
        cdInf = findViewById(R.id.cardInfo);
        cdWetha = findViewById(R.id.cardWeather);
        cdSafe = findViewById(R.id.cardSafe);

        cdSafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                Intent intent = new Intent(MainActivity.this, SafeHavens.class);
                startActivity(intent);
            }
        });

        cdInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                Intent intent = new Intent(MainActivity.this, Information.class);
                startActivity(intent);
            }
        });

        cdFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                Intent intent = new Intent(MainActivity.this, Forum.class);
                startActivity(intent);
            }
        });

        cdWetha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                Intent intent = new Intent(MainActivity.this, Weather.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();

        if (item_id ==R.id.menuadmin) {
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
        }
        return true;
    }
}