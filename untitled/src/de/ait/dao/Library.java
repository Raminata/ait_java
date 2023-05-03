package de.ait.dao;

import de.ait.data.Book;

public class Library {

    private Book[] books;
    private int size; //кол-во книжек в библиотеки
    //capacity - вместимость "библиотеки"

    public Library(int capacity) {
        books = new Book[capacity];
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }
    public int search(Book book){
        for(int i = 0; i < size; i++){
            if(books[i].equals(book)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                books[i] = books[size - 1];
                size--;
                return true;
            }
        }
        return false;

    }

    public void displayLibrary() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
