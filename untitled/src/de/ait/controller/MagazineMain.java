package de.ait.controller;

import de.ait.model.ArrayBookTools;
import de.ait.model.Book;
import de.ait.model.Magazine;

public class MagazineMain {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Book b1 = new Book("Bible", "God", 445566);
        Book b2 = new Book( "Black swan","Nasim Taleb", 8877766, 2312, 1922);

        Book [] books = new Book[2];
        books[0]=b1;
        books[1]=b2;

        ArrayBookTools.printBookArray(books);

        Magazine m1 = new Magazine("Sport today", "55", 66, 1985);

        System.out.println(m1.toString());


    }
}