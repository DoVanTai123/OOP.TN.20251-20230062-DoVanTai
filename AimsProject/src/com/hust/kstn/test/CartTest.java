package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Tom and Jerry", "Animation", "Joseph Barbera", 100, 20.00);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Pokemon", "Anime", "Satoshi Tajiri", 120, 15.50);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Avengers: Endgame", "Action", "Anthony Russo", 181, 29.99);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 21.50);

        cart.addDVD(dvd1, dvd2);
        cart.print();

        cart.addDVD(dvd3);
        cart.print();

        cart.addDVD(dvd4, dvd5);
        cart.print();

        cart.removeDVD(dvd2);
        cart.print();

        cart.addDVD(dvd6, dvd7);
        cart.print();

        cart.removeDVD(dvd2);
    }
}