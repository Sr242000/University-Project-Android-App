package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DrawingCapitalLetterMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_drawing_capital_letter_menu);

        Button Drawing_a = findViewById(R.id.drawing_capital_a_button);
        Button Drawing_b = findViewById(R.id.drawing_capital_b_button);
        Button Drawing_c = findViewById(R.id.drawing_capital_c_button);
        Button Drawing_d = findViewById(R.id.drawing_capital_d_button);
        Button Drawing_e = findViewById(R.id.drawing_capital_e_button);
        Button Drawing_f = findViewById(R.id.drawing_capital_f_button);
        Button Drawing_g = findViewById(R.id.drawing_capital_g_button);
        Button Drawing_h = findViewById(R.id.drawing_capital_h_button);
        Button Drawing_i = findViewById(R.id.drawing_capital_i_button);
        Button Drawing_j = findViewById(R.id.drawing_capital_j_button);
        Button Drawing_k = findViewById(R.id.drawing_capital_k_button);
        Button Drawing_l = findViewById(R.id.drawing_capital_l_button);
        Button Drawing_next = findViewById(R.id.drawing_capital_next_button);
        Button Drawing_back = findViewById(R.id.drawing_capital_home_button);


        Drawing_a.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalA.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_b.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalB.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_c.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalC.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_d.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalD.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_e.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalE.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_f.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalF.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_g.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalG.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_h.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalH.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_i.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalI.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_j.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalJ.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_k.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalK.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_l.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingDemoScreenCapitalL.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_next.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingCapitalLetterMenu2.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        Drawing_back.setOnClickListener(v -> {
            // Enable slide transition when pressing button
            Intent intent = new Intent(DrawingCapitalLetterMenu.this, DrawingLetterMenu.class);
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