package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CookingCapitalLetterMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_cooking_capital_letter_menu);

        Button Cooking_a = findViewById(R.id.cooking_capital_a_button);
        Button Cooking_b = findViewById(R.id.cooking_capital_b_button);
        Button Cooking_c = findViewById(R.id.cooking_capital_c_button);
        Button Cooking_d = findViewById(R.id.cooking_capital_d_button);
        Button Cooking_e = findViewById(R.id.cooking_capital_e_button);
        Button Cooking_f = findViewById(R.id.cooking_capital_f_button);
        Button Cooking_g = findViewById(R.id.cooking_capital_g_button);
        Button Cooking_h = findViewById(R.id.cooking_capital_h_button);
        Button Cooking_i = findViewById(R.id.cooking_capital_i_button);
        Button Cooking_j = findViewById(R.id.cooking_capital_j_button);
        Button Cooking_k = findViewById(R.id.cooking_capital_k_button);
        Button Cooking_l = findViewById(R.id.cooking_capital_l_button);
        Button next_button = findViewById(R.id.number_next_button_button);
        Button back_button = findViewById(R.id.number_cooking_menu_button);

        Cooking_a.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalA.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_b.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalB.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_c.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalC.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_d.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalD.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_e.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalE.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_f.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalF.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_g.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalG.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_h.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalH.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_i.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalI.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_j.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalJ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_k.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalK.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_l.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingDemoScreenCapitalL.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        next_button.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingCapitalLetterMenu2.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        back_button.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // Handle the back arrow button click by navigating to the "CookingCapitalMenu" activity
            Intent intent = new Intent(CookingCapitalLetterMenu.this, CookingMenu.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}