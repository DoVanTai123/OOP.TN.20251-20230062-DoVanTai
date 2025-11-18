package com.hust.kstn.models;

public class Store {
    private DigitalVideoDisc itemsInStore[];
    private int qtyInStore;
    private static final int MAX_NUM_IN_STORE = 100;

    public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_NUM_IN_STORE];
        qtyInStore = 0;
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_NUM_IN_STORE) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The disc " + disc.getTitle() + " has been added to the store.");
        } else {
            System.out.println("The store is full, cannot add more DVDs.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == disc) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("The disc " + disc.getTitle() + " has been removed from the store.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Could not find the disc " + disc.getTitle() + " in the store.");
        }
    }

    public void print() {
        System.out.println("****************STORE****************");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
        System.out.println("*************************************");
    }
}