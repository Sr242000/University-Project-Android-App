package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SportsSmallLetterMenu3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_sports_small_letter_menu3);

        Button sports_y = findViewById(R.id.sports_small_y_button);
        Button sports_z = findViewById(R.id.sports_small_z_button);
        Button drawing_previous = findViewById(R.id.sports_small_previous_button_2);

        sports_y.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu3.this, SportsDemoScreenSmallY.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sports_z.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu3.this, SportsDemoScreenSmallZ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_previous.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu3.this, SportsSmallLetterMenu2.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}