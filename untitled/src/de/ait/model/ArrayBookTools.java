package de.ait.model;

public class ArrayBookTools {

    public static void printBookArray(Book [] array){
        for(int i=0; i<array.length; i++){
            array[i].displayBook();
        }
    }

}