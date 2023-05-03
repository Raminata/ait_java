package de.ait.arraytools;

import de.ait.model.Book;

public class ArrayBookTools {

    public static void printArray(Book[] array){
        for(int i=0; i<array.length; i++){
          array[i].display();
        }
    }

}

