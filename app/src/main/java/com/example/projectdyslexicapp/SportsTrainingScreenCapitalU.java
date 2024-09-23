package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SportsTrainingScreenCapitalU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_sports_training_screen_capital_u);

        Toolbar toolbar = findViewById(R.id.toolbar6);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Enable the back arrow button
            actionBar.setDisplayHomeAsUpEnabled(true);
            // Remove the title text
            actionBar.setTitle("");
        }

        Button retry_button = findViewById(R.id.replay_button_sport_u_capital_training);
        Button next_button = findViewById(R.id.next_button_sport_u_capital_training);
        ImageView home_button = findViewById(R.id.home_button);
        Button back_button = findViewById(R.id.home_button_sport_u_capital_training);


        retry_button.setOnClickListener(v -> {
            // Replay the animation
            finish();
            overridePendingTransition(0, 0); // Disable transition animation
            startActivity(getIntent());
            overridePendingTransition(0, 0); // Disable transition animation
        });

        next_button.setOnClickListener(v -> {
            // Enable slide transition when pressing "Next" button
            Intent intent = new Intent(SportsTrainingScreenCapitalU.this, SportsTrialScreenCapitalU.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        home_button.setOnClickListener(v -> {
            // Enable slide transition when pressing "Next" button
            Intent intent = new Intent(SportsTrainingScreenCapitalU.this, SportsCapitalLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        back_button.setOnClickListener(v -> {
            // Enable slide transition when pressing "Next" button
            Intent intent = new Intent(SportsTrainingScreenCapitalU.this, SportsDemoScreenCapitalU.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }
}
