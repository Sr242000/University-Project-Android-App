package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SportsSmallLetterMenu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_sports_small_letter_menu2);

        Button sport_m = findViewById(R.id.sports_small_m_button);
        Button sport_n = findViewById(R.id.sports_small_n_button);
        Button sport_o = findViewById(R.id.sports_small_o_button);
        Button sport_p = findViewById(R.id.sports_small_p_button);
        Button sport_q = findViewById(R.id.sports_small_q_button);
        Button sport_r = findViewById(R.id.sports_small_r_button);
        Button sport_s = findViewById(R.id.sports_small_s_button);
        Button sport_t = findViewById(R.id.sports_small_t_button);
        Button sport_u = findViewById(R.id.sports_small_u_button);
        Button sport_v = findViewById(R.id.sports_small_v_button);
        Button sport_w = findViewById(R.id.sports_small_w_button);
        Button sport_x = findViewById(R.id.sports_small_x_button);
        Button sport_next = findViewById(R.id.sports_small_next_button);
        Button sport_previous = findViewById(R.id.sports_small_previous_button);

        sport_m.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallM.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_n.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallN.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_o.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallO.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_p.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallP.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_q.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallQ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_r.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallR.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_s.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallS.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_t.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallT.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_u.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallU.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_v.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallV.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_w.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallW.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_x.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsDemoScreenSmallX.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_next.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsSmallLetterMenu3.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        sport_previous.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(SportsSmallLetterMenu2.this, SportsSmallLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}