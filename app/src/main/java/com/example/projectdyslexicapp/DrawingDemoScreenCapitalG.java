package com.example.projectdyslexicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class DrawingDemoScreenCapitalG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_drawing_demo_screen_capital_g);

        Toolbar toolbar = findViewById(R.id.toolbar6);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Enable the back arrow button
            actionBar.setDisplayHomeAsUpEnabled(true);
            // Remove the title text
            actionBar.setTitle("");
        }

        Button drawing_replay = findViewById(R.id.replay_button_drawing_g_capital_demo);
        Button drawing_next = findViewById(R.id.next_button_drawing_g_capital_demo);
        ImageView home_button = findViewById(R.id.home_button);
        Button drawing_back = findViewById(R.id.home_button_drawing_g_capital_demo);

        drawing_replay.setOnClickListener(v -> {
            // Replay the animation
            finish();
            overridePendingTransition(0, 0); // Disable transition animation
            startActivity(getIntent());
            overridePendingTransition(0, 0); // Disable transition animation
        });

        drawing_next.setOnClickListener(v -> {
            // Enable slide transition when pressing "Next" button
            Intent intent = new Intent(DrawingDemoScreenCapitalG.this, DrawingTrainingScreenCapitalG.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        drawing_back.setOnClickListener(v -> {
            // Enable slide transition when pressing "Next" button
            Intent intent = new Intent(DrawingDemoScreenCapitalG.this, DrawingCapitalLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        home_button.setOnClickListener(v -> {
            // Enable slide transition when pressing "Next" button
            Intent intent = new Intent(DrawingDemoScreenCapitalG.this, DrawingCapitalLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });
    }

}
