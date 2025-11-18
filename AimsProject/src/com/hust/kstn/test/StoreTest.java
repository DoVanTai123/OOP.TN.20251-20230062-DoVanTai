package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 19.99);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Matrix", "Action", "Wachowskis", 136, 15.50);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Spirited Away", "Animation", "Hayao Miyazaki", 125, 22.00);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Parasite", "Drama", "Bong Joon-ho", 132, 18.75);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 24.95);

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd4);
        store.addDVD(dvd5);

        store.print();

        System.out.println("\n--- Removing 'The Matrix' ---");
        store.removeDVD(dvd2);
        store.print();

        System.out.println("\n--- Removing 'The Matrix' again ---");
        store.removeDVD(dvd2);
    }
}