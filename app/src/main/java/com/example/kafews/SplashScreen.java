package com.example.kafews;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceSTate) {

        super.onCreate(savedInstanceSTate);
        startActivity(new Intent(this,MainActivity.class));
    }
}
