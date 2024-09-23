package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SportsSmallLetterMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_sports_small_letter_menu);

        Button sport_a = findViewById(R.id.sport_small_a_button);
        Button sport_b = findViewById(R.id.sport_small_b_button);
        Button sport_c = findViewById(R.id.sport_small_c_button);
        Button sport_d = findViewById(R.id.sport_small_d_button);
        Button sport_e = findViewById(R.id.sport_small_e_button);
        Button sport_f = findViewById(R.id.sport_small_f_button);
        Button sport_g = findViewById(R.id.sport_small_g_button);
        Button sport_h = findViewById(R.id.sport_small_h_button);
        Button sport_i = findViewById(R.id.sport_small_i_button);
        Button sport_j = findViewById(R.id.sport_small_j_button);
        Button sport_k = findViewById(R.id.sport_small_k_button);
        Button sport_l = findViewById(R.id.sport_small_l_button);
        Button sport_next = findViewById(R.id.sport_small_next_button);
        Button sport_back = findViewById(R.id.sport_small_home_button);

        sport_a.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallA.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_b.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallB.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_c.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallC.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_d.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallD.class);
            startActivity(intent);
        });

        sport_e.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallE.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_f.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallF.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_g.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallG.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_h.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallH.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_i.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallI.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_j.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallJ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_k.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallK.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_l.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsDemoScreenSmallL.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_next.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsCapitalLetterMenu2.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_back.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu.this, SportsLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}