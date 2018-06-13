package com.example.lukas.ncsmusicapp;

// {@link Songs} represents the titles of the music app.
public class Songs {

        //Title of the song
        private String mSongTitle;

        // Artist of the song.
        private String mArtist;

        /**
         * Create a new Songs object.
         *
         * @param songTitle is the title of the song
         * @param  artist of the song
         */
        public Songs(String songTitle, String artist) {
            mSongTitle = songTitle;
            mArtist = artist;
        }

        //Get the name of the song
        public String getSongTitle() {
            return mSongTitle;
        }

        //Get the artist of the song
        public String getArtist() {
            return mArtist;
        }

    }