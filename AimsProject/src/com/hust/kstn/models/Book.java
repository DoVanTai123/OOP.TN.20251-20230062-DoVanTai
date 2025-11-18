package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private int numOfTokens;
    private List<BookAuthor> authors = new ArrayList<>();

    private static int nbBooks = 0;

    public Book(String title, String category, float cost, int numOfTokens) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;

        // Tự động cập nhật ID
        nbBooks++;
        this.id = nbBooks;
    }

    public void addAuthor(BookAuthor author) {
        if (!authors.contains(author)) {
            authors.add(author);
        }
    }

    public void removeAuthor(BookAuthor author) {
        if (authors.contains(author)) {
            authors.remove(author);
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    @Override
    public String toString() {
        return "Book [" + this.id + "][" + this.title + "] [" + this.cost + "][" + this.category + "][" + this.numOfTokens + "]" + "\nAuthors: " + this.authors;
    }
}