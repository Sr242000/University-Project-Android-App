package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SportsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_sports_menu);

        Button Sports_letter = findViewById(R.id.sports_letters_button);
        Button Sports_number = findViewById(R.id.sports_numbers_button);

        Sports_letter.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsMenu.this, SportsLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_number.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsMenu.this, SportsNumberMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}