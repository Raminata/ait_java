package de.ait.controller;

import de.ait.arraytools.ArrayBookTools;
import de.ait.model.Book;

public class MainBook {
    public static void main(String[] args) {
        Book design = new Book(579);
        Book design1 = new Book("design", 1, "Pushkin", 2012, 200);
        Book design2 = new Book("design2", 45496, "Marko", 2020, 20);
        Book[] arrayBook = new Book[3];

        arrayBook[0] = design;
        arrayBook[1] = design1;
        arrayBook[2] = design2;

        ArrayBookTools.printArray(arrayBook);
    }
}

// 1 package controller & model
// Model
// Books
// -> Class Book
// String title
// int isbn
// String author
// int years
// int pages
// Constructor 2 разных
// Getters and Setters
// Display

// Class - ArrayBookTools -> метод выводит на консоль массив книг

// Contoller -> Main
// 5 Создаете 5 разных книг