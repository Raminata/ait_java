package de.ait.data;

import java.util.Arrays;

public class Book {


    private String title;
    private String[] authors;
    private int isbn;
    private int pages;
    private int year;

    public Book(String title, String[] authors, int isbn, int pages, int year) {
        this.title = title;
        this.authors = authors;
        this.isbn = isbn;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", isbn=" + isbn +
                ", pages=" + pages +
                ", year=" + year +
                '}';
    }
    public static class Student {
        private int id;
        private String name;
        private MyDate birthday;

        public Student(int id, String name, MyDate birthday) {
            this.id=id;
            this.name= name;
            this.birthday=birthday;
        }

        public String toString() {
            return id + ". " + name + "(" + birthday + ")";
        }
    }
}
