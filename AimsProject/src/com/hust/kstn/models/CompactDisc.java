package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {

    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String artist, String director, float cost) {
        super(title, category, director, 0, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        for (Track t : tracks) {
            if (t.getTitle().equals(track.getTitle()) && t.getLength() == track.getLength()) {
                System.out.println("Track already exists: " + track.getTitle());
                return;
            }
        }
        tracks.add(track);
        System.out.println("Track added: " + track.getTitle());
    }

    public void removeTrack(Track track) {
        for (Track t : tracks) {
            if (t.getTitle().equals(track.getTitle()) && t.getLength() == track.getLength()) {
                tracks.remove(t);
                System.out.println("Track removed: " + track.getTitle());
                return;
            }
        }
        System.out.println("Track not found: " + track.getTitle());
    }

    public int totalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }

    public void play() {
        System.out.println("--- Playing CD: " + this.getTitle() + " ---");
        System.out.println("CD total length: " + this.totalLength());
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        return "CD: " + super.toString() + " - Artist: " + this.artist;
    }
}