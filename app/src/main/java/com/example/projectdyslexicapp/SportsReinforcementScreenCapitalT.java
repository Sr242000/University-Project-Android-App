package com.example.projectdyslexicapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SportsReinforcementScreenCapitalT extends AppCompatActivity {

    ViewGroup paintView;
    float lastX = 0, lastY = 0;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_sports_reinforcement_screen_capital_t);

        Toolbar toolbar = findViewById(R.id.toolbar6);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Enable the back arrow button
            actionBar.setDisplayHomeAsUpEnabled(true);
            // Remove the title text
            actionBar.setTitle("");
        }

        Button sports_retry = findViewById(R.id.replay_button_sport_t_capital_reinforcement);
        Button sports_back  = findViewById(R.id.menu_button_sport_t_capital_reinforcement);
        ImageView home_button = findViewById(R.id.home_button);

        sports_retry.setOnClickListener(v -> {
            Intent intent = new Intent(SportsReinforcementScreenCapitalT.this, SportsReinforcementScreenCapitalT.class);
            startActivity(intent);
            overridePendingTransition(0, 0); // Disable transition animation
            startActivity(getIntent());
            overridePendingTransition(0, 0); // Disable transition animation
        });

        sports_back.setOnClickListener(v -> {
            // Enable slide transition when pressing "Next" button
            Intent intent = new Intent(SportsReinforcementScreenCapitalT.this, SportsTrialScreenCapitalT.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        home_button.setOnClickListener(v -> {
            // Enable slide transition when pressing "Next" button
            Intent intent = new Intent(SportsReinforcementScreenCapitalT.this, SportsCapitalLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        paintView = findViewById(R.id.paintView);
        paintView.setOnTouchListener((v, event) -> {

            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    lastX = event.getX();
                    lastY = event.getY();
                    addPaintView(lastX, lastY);
                    break;
                case MotionEvent.ACTION_MOVE:
                    float newX = event.getX();
                    float newY = event.getY();
                    addPaintView(newX, newY);
                    lastX = newX;
                    lastY = newY;
                    break;
            }
            return true;
        });
    }

    private void addPaintView(float x, float y) {
        ImageView paintDot = new ImageView(this);
        paintDot.setImageResource(R.drawable.red_circle); // Reference to your paint dot image
        paintDot.setLayoutParams(new ViewGroup.LayoutParams(75, 75));
        paintDot.setX(x - 25);
        paintDot.setY(y - 25);
        paintView.addView(paintDot);
    }
}