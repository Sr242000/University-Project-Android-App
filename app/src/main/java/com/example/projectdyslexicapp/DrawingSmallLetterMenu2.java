package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DrawingSmallLetterMenu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_drawing_small_letter_menu2);

        Button drawing_m = findViewById(R.id.drawing_small_m_button);
        Button drawing_n = findViewById(R.id.drawing_small_n_button);
        Button drawing_o = findViewById(R.id.drawing_small_o_button);
        Button drawing_p = findViewById(R.id.drawing_small_p_button);
        Button drawing_q = findViewById(R.id.drawing_small_q_button);
        Button drawing_r = findViewById(R.id.drawing_small_r_button);
        Button drawing_s = findViewById(R.id.drawing_small_s_button);
        Button drawing_t = findViewById(R.id.drawing_small_t_button);
        Button drawing_u = findViewById(R.id.drawing_small_u_button);
        Button drawing_v = findViewById(R.id.drawing_small_v_button);
        Button drawing_w = findViewById(R.id.drawing_small_w_button);
        Button drawing_x = findViewById(R.id.drawing_small_x_button);
        Button drawing_next = findViewById(R.id.drawing_small_next_button_2);
        Button drawing_back = findViewById(R.id.drawing_small_previous_button);

        drawing_m.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallM.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_n.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallN.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_o.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallO.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_p.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallP.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_q.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallQ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_r.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallR.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_s.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallS.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_t.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallT.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_u.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallU.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_v.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallV.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_w.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallW.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_x.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingDemoScreenSmallX.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_next.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingSmallLetterMenu3.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_back.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingSmallLetterMenu2.this, DrawingSmallLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}