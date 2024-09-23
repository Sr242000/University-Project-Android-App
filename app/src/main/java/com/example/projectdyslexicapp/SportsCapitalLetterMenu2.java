package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SportsCapitalLetterMenu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_sports_capital_letter_menu2);

        Button Sports_m = findViewById(R.id.sport_capital_m_button);
        Button Sports_n = findViewById(R.id.sport_capital_n_button);
        Button Sports_o = findViewById(R.id.sport_capital_o_button);
        Button Sports_p = findViewById(R.id.sport_capital_p_button);
        Button Sports_q = findViewById(R.id.sport_capital_q_button);
        Button Sports_r = findViewById(R.id.sport_capital_r_button);
        Button Sports_s = findViewById(R.id.sport_capital_s_button);
        Button Sports_t = findViewById(R.id.sport_capital_t_button);
        Button Sports_u = findViewById(R.id.sport_capital_u_button);
        Button Sports_v = findViewById(R.id.sport_capital_v_button);
        Button Sports_w = findViewById(R.id.sport_capital_w_button);
        Button Sports_x = findViewById(R.id.sport_capital_x_button);

        Button Sports_next = findViewById(R.id.sport_capital_next_button_2);
        Button Sports_previous = findViewById(R.id.sport_capital_previous_button);


        Sports_m.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalM.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_n.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalN.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_o.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalO.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_p.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalP.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_q.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalQ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_r.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalR.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_s.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalS.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_t.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalT.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_u.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalU.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_v.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalV.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_w.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalW.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_x.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsDemoScreenCapitalX.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_next.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsCapitalLetterMenu3.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Sports_previous.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsCapitalLetterMenu2.this, SportsCapitalLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}