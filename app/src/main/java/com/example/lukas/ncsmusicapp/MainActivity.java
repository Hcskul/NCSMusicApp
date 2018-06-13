package com.example.lukas.ncsmusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Songs> songList = new ArrayList<Songs>();
        songList.add(new Songs("Alan Walker", "Fade"));
        songList.add(new Songs("Aero Chord", "Time Leap"));

        SongAdapter adapter = new SongAdapter(this, songList);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        //Set a onitemclicklistener on that view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs song = (Songs) listView.getItemAtPosition(position);
                if (position == 0){
                    Intent alanWalker = new Intent(MainActivity.this, alanWalkerPlay.class);
                    startActivity(alanWalker);
                }
                else {
                    Intent aeroChord = new Intent(MainActivity.this, aeroChordPlay.class);
                    startActivity(aeroChord);
                }
            }
        });


    }
}