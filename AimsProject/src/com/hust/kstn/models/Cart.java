package com.hust.kstn.models;

public class Cart {

    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;


    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
        } else {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added successfully");
        }
    }


    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }

        int foundIndex = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i] == disc) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("The disc does not exist");
        } else {
            for (int i = foundIndex; i < qtyOrdered - 1; i++) {
                itemOrdered[i] = itemOrdered[i + 1];
            }
            itemOrdered[qtyOrdered - 1] = null;
            qtyOrdered--;
            System.out.println("The disc has been removed successfully");
        }
    }


    public double calculateTotalCost() {
        double total = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }


    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            // (Chúng ta sẽ sửa lại hàm in này ở Mục 2.3)
            System.out.println((i + 1) + ". DVD - [Title]: " + itemOrdered[i].getTitle() +
                    " - [Cost]: " + itemOrdered[i].getCost() + "$");
        }
        System.out.println("Total items: " + qtyOrdered);
        System.out.println("Total cost: " + calculateTotalCost() + "$");
        System.out.println("***************************************************");
    }
}