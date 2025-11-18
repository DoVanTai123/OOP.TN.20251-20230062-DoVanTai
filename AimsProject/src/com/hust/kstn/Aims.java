package com.hust.kstn;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

import java.util.List;

public class Aims {

    public static void main(String[] args) {
        Cart anOrder = new Cart();


        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);

        anOrder.addDVD(dvd1);
        anOrder.addDVD(dvd2);
        anOrder.addDVD(dvd3);

        System.out.println("DVD 1 ID: " + dvd1.getId());
        System.out.println("DVD 2 ID: " + dvd2.getId());
        System.out.println("DVD 3 ID: " + dvd3.getId());

        System.out.println("--- Cart ban đầu ---");
        anOrder.print();

        System.out.println("\n--- Đang xóa DVD 'Star Wars' ---");
        anOrder.removeDVD(dvd2);
        anOrder.print();
    }
}