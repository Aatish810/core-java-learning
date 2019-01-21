package com.aatish;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
   private ArrayList<Song> songs;
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if(hasSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        } else {
            System.out.println("Song already present");
        }
        return false;
    }

    private Song hasSong(String title) {
        for(int i =0; i< this.songs.size(); i++) {
            Song checkedSong = this.songs.get(i);
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        int index = trackNumber - 1;
        if((index >=0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This Album doesnot have tract no.: " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = hasSong(title);
        if(checkedSong != null) {
             playList.add(checkedSong);
             return true;
        }
        System.out.println(title+ " Song doesnot exist in Album");
        return false;
    }
}
