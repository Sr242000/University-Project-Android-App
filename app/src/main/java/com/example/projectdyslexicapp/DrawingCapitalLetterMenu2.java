package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DrawingCapitalLetterMenu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_drawing_capital_letter_menu2);

        Button Drawing_m = findViewById(R.id.drawing_capital_m_button);
        Button Drawing_n = findViewById(R.id.drawing_capital_n_button);
        Button Drawing_o = findViewById(R.id.drawing_capital_o_button);
        Button Drawing_p = findViewById(R.id.drawing_capital_p_button);
        Button Drawing_q = findViewById(R.id.drawing_capital_q_button);
        Button Drawing_r = findViewById(R.id.drawing_capital_r_button);
        Button Drawing_s = findViewById(R.id.drawing_capital_s_button);
        Button Drawing_t = findViewById(R.id.drawing_capital_t_button);
        Button Drawing_u = findViewById(R.id.drawing_capital_u_button);
        Button Drawing_v = findViewById(R.id.drawing_capital_v_button);
        Button Drawing_w = findViewById(R.id.drawing_capital_w_button);
        Button Drawing_x = findViewById(R.id.drawing_capital_x_button);
        Button Drawing_next = findViewById(R.id.drawing_capital_next_button_2);
        Button Drawing_previous = findViewById(R.id.drawing_capital_previous_button);


        Drawing_m.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalM.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_n.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalN.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_o.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalO.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_p.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalP.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_q.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalQ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_r.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalR.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_s.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalS.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_t.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalT.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_u.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalU.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_v.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalV.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_w.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalW.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_x.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingDemoScreenCapitalX.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_next.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingCapitalLetterMenu3.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_previous.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu2.this, DrawingCapitalLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // Handle the back arrow button click by navigating to the "CookingCapitalMenu" activity
            Intent intent = new Intent(this, DrawingMenu.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}