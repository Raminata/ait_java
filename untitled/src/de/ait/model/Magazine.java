package de.ait.model;

public class Magazine {

    private String name;
    private String pages;
    private int copys;
    private int year;



    public Magazine(String name, String pages, int copys, int year) {
        this.name = name;
        this.pages = pages;
        this.copys = copys;
        this.year = year;
    }

    public Magazine(String name, String pages, int copys) {
        this.name = name;
        this.pages = pages;
        this.copys = copys;
    }

    public String getName() {
        return name;
    }

    public String getPages() {
        return pages;
    }

    public int getCopys() {
        return copys;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void setCopys(int copys) {
        this.copys = copys;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", pages='" + pages + '\'' +
                ", copys=" + copys +
                ", year=" + year +
                '}';
    }
}