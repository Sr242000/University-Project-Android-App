package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DrawingSmallLetterMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_drawing_small_letter_menu);

        Button drawing_a = findViewById(R.id.drawing_small_a_button);
        Button drawing_b = findViewById(R.id.drawing_small_b_button);
        Button drawing_c = findViewById(R.id.drawing_small_c_button);
        Button drawing_d = findViewById(R.id.drawing_small_d_button);
        Button drawing_e = findViewById(R.id.drawing_small_e_button);
        Button drawing_f = findViewById(R.id.drawing_small_f_button);
        Button drawing_g = findViewById(R.id.drawing_small_g_button);
        Button drawing_h = findViewById(R.id.drawing_small_h_button);
        Button drawing_i = findViewById(R.id.drawing_small_i_button);
        Button drawing_j = findViewById(R.id.drawing_small_j_button);
        Button drawing_k = findViewById(R.id.drawing_small_k_button);
        Button drawing_l = findViewById(R.id.drawing_small_l_button);
        Button drawing_next = findViewById(R.id.drawing_small_next_button);
        Button drawing_back = findViewById(R.id.drawing_small_home_button);

        drawing_a.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallA.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_b.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallB.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_c.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallC.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_d.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallD.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_e.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallE.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_f.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallF.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_g.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallG.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_h.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallH.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_i.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallI.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_j.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallJ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_k.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallK.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_l.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingDemoScreenSmallL.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_next.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingSmallLetterMenu2.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_back.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu.this, DrawingLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}