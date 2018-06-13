package com.example.lukas.ncsmusicapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aeroChordInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aero_chord_info);

        Button backButton = (Button) findViewById(R.id.backButton);

        // Set a click listener on that View
        backButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link alanWalkerPlay}

                Intent mainIntent = new Intent(aeroChordInfo.this, aeroChordPlay.class);

                // Start the new activity
                startActivity(mainIntent);
            }
        });

        Button linkButton = (Button) findViewById(R.id.linkButton);

        linkButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked.
            @Override
            public void onClick(View view) {
                String url = getResources().getString(R.string.aeroChordUrl);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
