package de.ait.controller;

import de.ait.dao.Library;
import de.ait.data.Book;

public class Main1 {
    public static void main(String[] args) {

        String[] authors1 = {"Karl Marx", "Fridrich Engels"};
        String[] authors2 = {"Lev Tolstoy"};
        String[] authors3 = {"Ilf", "Evgenii Petroff"};

        Book b1 = new Book("Kapital", authors1, 2341234, 358, 1905);
        Book b2 = new Book("War and Pease", authors2, 3423421, 234, 1869);
        Book b3 = new Book("12 chairs", authors3, 3412342, 123, 1927);

        Library myLib = new Library(20);
        myLib.addBook(b1);
        myLib.addBook(b2);
        myLib.addBook(b3);

        myLib.displayLibrary();
        System.out.println("*********************");

        myLib.removeBook(b1);
        myLib.displayLibrary();
        myLib.addBook(b1);
        System.out.println("**********************");
        myLib.displayLibrary();
        System.out.println(myLib.search(b2) + b2.toString());

    }
}