package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DrawingLetterMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_drawing_letter_menu);

        Button Drawing_capital_letter = findViewById(R.id.drawing_capital_letter_button);
        Button Drawing_small_letter = findViewById(R.id.drawing_small_letter_button);

        Drawing_capital_letter.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingLetterMenu.this, DrawingCapitalLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_small_letter.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingLetterMenu.this, DrawingSmallLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}