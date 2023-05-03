package de.ait.model;

public class Book {

    private String title;
    private int isbn;
    private String author;
    private int years;
    private int pages;

    public Book(int pages) {
        this.pages = pages;
    }
    public Book(String title, String author, int isbn, int pages, int years){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.pages=pages;
        this.years=years;
    }

    public Book(String title, String author, int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }


    public Book(String title, int isbn, String author, int years, int pages) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.years = years;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void display() {
        System.out.println("Author: " + author);
        System.out.println("isbn: " + isbn);
        System.out.println("pages: " + pages);
        System.out.println("year: " + years);
        System.out.println("titel: " + title);
    }

    public void displayBook() {
        System.out.println("Author: " + author);
        System.out.println("isbn: " + isbn);
        System.out.println("pages: " + pages);
        System.out.println("year: " + years);
        System.out.println("titel: " + title);
    }
}
