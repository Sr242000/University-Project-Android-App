package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DrawingMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_drawing_menu);

        Button Drawing_letter = findViewById(R.id.drawing_letters_button);
        Button Drawing_number = findViewById(R.id.drawing_numbers_button);

        Drawing_letter.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingMenu.this, DrawingLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_number.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingMenu.this, DrawingNumberMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}