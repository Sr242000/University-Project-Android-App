package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DrawingCapitalLetterMenu3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_drawing_capital_letter_menu3);

        Button drawing_y = findViewById(R.id.drawing_capital_y_button);
        Button drawing_z = findViewById(R.id.drawing_capital_z_button);
        Button drawing_previous = findViewById(R.id.drawing_capital_previous_button_2);

        drawing_y.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu3.this, DrawingDemoScreenCapitalY.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_z.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu3.this, DrawingDemoScreenCapitalZ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_previous.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu3.this, DrawingCapitalLetterMenu2.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // Handle the back arrow button click by navigating to the "CookingCapitalMenu" activity
            Intent intent = new Intent(this,DrawingMenu.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}