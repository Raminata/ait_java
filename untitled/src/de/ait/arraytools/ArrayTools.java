package de.ait.arraytools;

import de.ait.model.Person;

public class ArrayTools {

    public static void fillArray(int array[], int min, int max){
        for(int i=0; i<array.length; i++){
            array[i]=(int)(min+Math.random()*(max+1-min));
        }
    }

    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.println("Arr ["+i+"]"+"="+array[i]);
        }
    }

    public static void printArrayPerson(Person[] arrayPersons) {
        for(int i=0; i<arrayPersons.length; i++){
            arrayPersons[i].displayPerson();
            System.out.println("---------------");
        }
    }
}