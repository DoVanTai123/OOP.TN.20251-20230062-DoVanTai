package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

public class CompactDiscTest {
    public static void main(String[] args) {

        CompactDisc cd = new CompactDisc("Greatest Hits", "Pop", "Michael Jackson", "Various", 15.99f);

        Track t1 = new Track("Billie Jean", 294);
        Track t2 = new Track("Thriller", 357);
        Track t3 = new Track("Beat It", 258);

        cd.addTrack(t1);
        cd.addTrack(t2);
        cd.addTrack(t3);

        System.out.println("--- Test Add Duplicate ---");
        cd.addTrack(t1);

        System.out.println("\n--- CD Info ---");
        System.out.println(cd.toString());

        System.out.println("\n--- Playing CD ---");
        cd.play();

        System.out.println("\n--- Removing Track 'Thriller' ---");
        cd.removeTrack(t2);

        System.out.println("\n--- CD Info After Remove ---");
        System.out.println(cd.toString());
    }
}