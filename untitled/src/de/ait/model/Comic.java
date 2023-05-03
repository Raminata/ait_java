package de.ait.model;

public class Comic {

    private String name;
    private String author;
    private int pages;
    private String style;


    public Comic(String name, String author, int pages, String style) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getStyle() {
        return style;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String toString() {
        return "Comic{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", style='" + style + '\'' +
                '}';
    }
}
