// Write your code here
package com.example.song;

import java.util.ArrayList;

public interface SongRepository {
    ArrayList<Song> getSongs();
    Song getSongBySongId(int songId);
    Song addSong(Song song);
    Song updateSong(int songId,Song song);
    void deleteSong(int songId);
}