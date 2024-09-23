package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CookingSmallLetterMenu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_cooking_small_letter_menu2);

        Button Cooking_m = findViewById(R.id.cooking_small_m_button);
        Button Cooking_n = findViewById(R.id.cooking_small_n_button);
        Button Cooking_o = findViewById(R.id.cooking_small_o_button);
        Button Cooking_p = findViewById(R.id.cooking_small_p_button);
        Button Cooking_q = findViewById(R.id.cooking_small_q_button);
        Button Cooking_r = findViewById(R.id.cooking_small_r_button);
        Button Cooking_s = findViewById(R.id.cooking_small_s_button);
        Button Cooking_t = findViewById(R.id.cooking_small_t_button);
        Button Cooking_u = findViewById(R.id.cooking_small_u_button);
        Button Cooking_v = findViewById(R.id.cooking_small_v_button);
        Button Cooking_w = findViewById(R.id.cooking_small_w_button);
        Button Cooking_x = findViewById(R.id.cooking_small_x_button);
        Button next_button = findViewById(R.id.cooking_small_next_button_3);
        Button Cooking_previous = findViewById(R.id.cooking_small_previous_button);

        Cooking_m.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallM.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_n.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallN.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_o.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallO.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_p.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallP.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_q.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallQ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_r.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallR.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_s.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallS.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_t.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallT.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_u.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallU.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_v.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallV.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_w.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallW.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_x.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingDemoScreenSmallX.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        next_button.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingSmallLetterMenu3.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Cooking_previous.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(CookingSmallLetterMenu2.this, CookingSmallLetterMenu.class);
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