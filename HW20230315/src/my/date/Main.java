package my.date;

import my.date.MyDate;

public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(15,03,2023);
        MyDate date1 = new MyDate(16,03,2023);
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date.equals(date1));
    }
}