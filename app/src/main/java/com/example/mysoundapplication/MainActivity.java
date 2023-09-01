package com.example.mysoundapplication;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button blackButton = findViewById(R.id.buttonBlack);
        final MediaPlayer blackSound = MediaPlayer.create(this, R.raw.black);
        blackButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                blackSound.start();
            }
        });

        Button greenButton = findViewById(R.id.buttonGreen);
        final MediaPlayer greenSound = MediaPlayer.create(this, R.raw.green);
        greenButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                greenSound.start();
            }
        });

        Button purpleButton = findViewById(R.id.buttonPurple);
        final MediaPlayer purpleSound = MediaPlayer.create(this, R.raw.purple);
        purpleButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                purpleSound.start();
            }
        });

        Button redButton = findViewById(R.id.buttonRed);
        final MediaPlayer redSound = MediaPlayer.create(this, R.raw.red);
        redButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                redSound.start();
            }
        });

        Button yellowButton = findViewById(R.id.buttonYellow);
        final MediaPlayer orangeSound = MediaPlayer.create(this, R.raw.yellow);
        yellowButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                orangeSound.start();
            }
        });
    }






}


