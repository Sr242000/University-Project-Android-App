package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SportsCapitalLetterMenu3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_sports_capital_letter_menu3);

        Button Sport_y = findViewById(R.id.sport_capital_y_button);
        Button Sport_z = findViewById(R.id.sport_capital_z_button);
        Button Cooking_previous = findViewById(R.id.sport_capital_previous_button_2);

        Sport_y.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu3.this, SportsDemoScreenCapitalY.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sport_z.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu3.this, SportsDemoScreenCapitalZ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_previous.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu3.this, SportsCapitalLetterMenu2.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}