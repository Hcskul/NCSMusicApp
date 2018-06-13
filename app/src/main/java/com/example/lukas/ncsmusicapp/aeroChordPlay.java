package com.example.lukas.ncsmusicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class aeroChordPlay extends AppCompatActivity {

    //initializes an instance of the mediaPlayer
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aero_chord_play);

        // sets this instance to a specific song
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.aero_chord_time_leap);
        Button backButton = (Button) findViewById(R.id.backButton);

        // Set a click listener on that View
        backButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                // checks if the mediaplayer is playing, if so stops it and sends intent to open MainActivity
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent mainIntent = new Intent(aeroChordPlay.this, MainActivity.class);

                // Start the new activity
                startActivity(mainIntent);
            }
        });

        // Find the View that shows the play/pause image
        ImageButton playButton = (ImageButton) findViewById(R.id.playButton);

        // Set a click listener on that View
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when play/pause button is clicked.
            @Override
            public void onClick(View view) {
                // checks if the mediaplayer is playing, if so pauses it
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                } else {
                    mediaPlayer.start();
                }
            }
        });

        // Find the View that shows the more informations button
        Button moreInformations = (Button) findViewById(R.id.moreInformation);

        // Set a click listener on that View
        moreInformations.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {

                // checks if the mediaplayer is playing, if so stops it and sends intent to open MainActivity
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }

                // Create a new intent to open the {@link MoreInformationActivity}
                Intent moreInfointent = new Intent(aeroChordPlay.this, aeroChordInfo.class);

                // Start the new activity
                startActivity(moreInfointent);
            }
        });
    }


    // for the case, that the user hits the back button of the phone, it will stop the media playback
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }
}
