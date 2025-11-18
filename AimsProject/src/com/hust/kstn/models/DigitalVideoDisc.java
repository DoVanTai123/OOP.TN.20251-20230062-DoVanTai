package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, category, director, length, (float)cost);
    }

    public DigitalVideoDisc(String title) {
        super(title, null, null, 0, 0);
    }

    public DigitalVideoDisc(String title, String category, double cost) {
        super(title, category, null, 0, (float)cost);
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        super(title, category, director, 0, (float)cost);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public String toString() {
        return "DVD: " + super.toString();
    }
}