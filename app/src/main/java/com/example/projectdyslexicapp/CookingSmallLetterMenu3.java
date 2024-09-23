package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CookingSmallLetterMenu3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_cooking_small_letter_menu3);

        Button Cooking_y = findViewById(R.id.cooking_small_y_button);
        Button Cooking_z = findViewById(R.id.cooking_small_z_button);
        Button Cooking_previous = findViewById(R.id.cooking_small_previous_button_2);

        Cooking_y.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu3.this, CookingDemoScreenSmallY.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_z.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu3.this, CookingDemoScreenSmallZ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_previous.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu3.this, CookingSmallLetterMenu2.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // Handle the back arrow button click by navigating to the "CookingCapitalMenu" activity
            Intent intent = new Intent(this, CookingMenu.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}