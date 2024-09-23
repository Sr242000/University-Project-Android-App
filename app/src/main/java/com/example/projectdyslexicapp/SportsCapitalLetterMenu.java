package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SportsCapitalLetterMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_sports_capital_letter_menu);

        Button Sports_a = findViewById(R.id.sport_capital_a_button);
        Button Sports_b = findViewById(R.id.sport_capital_b_button);
        Button Sports_c = findViewById(R.id.sport_capital_c_button);
        Button Sports_d = findViewById(R.id.sport_capital_d_button);
        Button Sports_e = findViewById(R.id.sport_capital_e_button);
        Button Sports_f = findViewById(R.id.sport_capital_f_button);
        Button Sports_g = findViewById(R.id.sport_capital_g_button);
        Button Sports_h = findViewById(R.id.sport_capital_h_button);
        Button Sports_i = findViewById(R.id.sport_capital_i_button);
        Button Sports_j = findViewById(R.id.sport_capital_j_button);
        Button Sports_k = findViewById(R.id.sport_capital_k_button);
        Button Sports_l = findViewById(R.id.sport_capital_l_button);
        Button Sports_next = findViewById(R.id.sport_capital_next_button);
        Button Sports_back = findViewById(R.id.sport_capital_home_button);


        Sports_a.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalA.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_b.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalB.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_c.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalC.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_d.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalD.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_e.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalE.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_f.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalF.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_g.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalG.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_h.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalH.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_i.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalI.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_j.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalJ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_k.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalK.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_l.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsDemoScreenCapitalL.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_next.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsCapitalLetterMenu2.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_back.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu.this, SportsLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}