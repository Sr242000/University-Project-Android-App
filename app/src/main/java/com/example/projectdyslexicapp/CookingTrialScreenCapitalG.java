package com.example.projectdyslexicapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CookingTrialScreenCapitalG extends AppCompatActivity {
    ImageView imageView;
    float xDown=0, yDown=0;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disable transition animation for the initial screen
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);

        setContentView(R.layout.activity_cooking_trial_screen_capital_g);

        Toolbar toolbar = findViewById(R.id.toolbar6);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Enable the back arrow button
            actionBar.setDisplayHomeAsUpEnabled(true);
            // Remove the title text
            actionBar.setTitle("");
        }

        Button retry_button = findViewById(R.id.replay_button_cooking_g_capital_trial);
        Button next_button = findViewById(R.id.next_button_cooking_g_capital_trial);
        ImageView home_button = findViewById(R.id.home_button);
        Button back_button = findViewById(R.id.home_button_cooking_g_capital_trial);

        retry_button.setOnClickListener(v -> {
            Intent intent = new Intent(CookingTrialScreenCapitalG.this, CookingTrialScreenCapitalG.class);
            startActivity(intent);
            finish();
            overridePendingTransition(0, 0); // Disable transition animation
            startActivity(getIntent());
            overridePendingTransition(0, 0); // Disable transition animation
        });

        next_button.setOnClickListener(v -> {
            Intent intent = new Intent(CookingTrialScreenCapitalG.this, CookingReinforcementScreenCapitalG.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        home_button.setOnClickListener(v -> {
            // Enable slide transition when pressing "Next" button
            Intent intent = new Intent(CookingTrialScreenCapitalG.this, CookingTrainingScreenCapitalG.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        back_button.setOnClickListener(v -> {
            // Enable slide transition when pressing "Next" button
            Intent intent = new Intent(CookingTrialScreenCapitalG.this, CookingCapitalLetterMenu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        imageView=findViewById(R.id.cookie_trial_capital_g);
        imageView.setOnTouchListener((v, event) -> {

            switch (event.getActionMasked()){
                case MotionEvent.ACTION_DOWN:
                    xDown = event.getX();
                    yDown = event.getY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    float movedX, movedY;
                    movedX = event.getX();
                    movedY = event.getY();

                    float distanceX=movedX-xDown;
                    float distanceY=movedY-yDown;

                    imageView.setX(imageView.getX()+distanceX);
                    imageView.setY(imageView.getY()+distanceY);

                    break;
            }
            return true;
        });
    }

   
}