package com.example.projectdyslexicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_main);

        Button Sports = findViewById(R.id.sports_button);
        Button Drawing = findViewById(R.id.drawing_button);
        Button Cooking = findViewById(R.id.cooking_button);

        Sports.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(MainActivity.this, SportsMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(MainActivity.this, DrawingMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(MainActivity.this, CookingMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}