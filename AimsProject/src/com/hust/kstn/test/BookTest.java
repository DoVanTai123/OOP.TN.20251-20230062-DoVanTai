package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("J.K. Rowling", 1965, "British author, best known for Harry Potter");
        BookAuthor author2 = new BookAuthor("George R.R. Martin", 1948, "American novelist, wrote A Song of Ice and Fire");
        BookAuthor author3 = new BookAuthor("Stephen King", 1947, "King of Horror");
        BookAuthor author4 = new BookAuthor("Haruki Murakami", 1949, "Japanese writer");
        BookAuthor author5 = new BookAuthor("Nam Cao", 1915, "Vietnamese writer");

        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "Fantasy", 20.99f, 76944);
        Book book2 = new Book("A Game of Thrones", "Fantasy", 25.50f, 298000);
        Book book3 = new Book("IT", "Horror", 15.00f, 400000);
        Book book4 = new Book("Norwegian Wood", "Romance", 12.99f, 120000);
        Book book5 = new Book("Chi Pheo", "Short Story", 5.00f, 5000);

        book1.addAuthor(author1);

        book2.addAuthor(author2);

        book3.addAuthor(author3);
        book3.addAuthor(author2);

        book4.addAuthor(author4);
        book5.addAuthor(author5);

        System.out.println("--- Initial Book List ---");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
        System.out.println(book5.toString());

        System.out.println("\n--- Removing George R.R. Martin from 'IT' ---");
        book3.removeAuthor(author2);
        System.out.println(book3.toString());

        System.out.println("\n--- Trying to add existing author to Book 1 ---");
        book1.addAuthor(author1);
        System.out.println(book1.toString());
    }
}