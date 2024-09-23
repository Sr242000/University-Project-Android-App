package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CookingMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_cooking_menu);

        Button Cooking_letter = findViewById(R.id.cooking_letters_button);
        Button Cooking_number = findViewById(R.id.cooking_numbers_button);

        Cooking_letter.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingMenu.this, CookingLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_number.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingMenu.this, CookingNumberMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // Handle the back arrow button click by navigating to the "CookingCapitalMenu" activity
            Intent intent = new Intent(CookingMenu.this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}