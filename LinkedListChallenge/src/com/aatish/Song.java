package com.aatish;

public class Song {

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    private String title;
    private double duration;

    @Override
    public String toString() {
        return this.title + "s " + this.duration;
    }
}
