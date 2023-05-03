package HW20230411;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 3. *(со звездочкой)
 * * Есть  не пустой текстовый файл, состоящий из строчек, содержащих
 * * имя и возраст такого вида:
 * * John, 3
 * * Jack, 23
 * * Jill, 19
 * * Bill, 15
 * * Ann, 54
 * * Написать метод, читающий файл и возвращающий список из людей
 * * старше 18 лет отсортированный по возрасту.
 */
public class Person {
     String name;
     int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        System.out.println("From file");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("person.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);

                String[] split = line.split(",");
                String name = split[0].trim();
                String age = split[1].trim();
                Integer ageNum = Integer.parseInt(age);
                if(ageNum >= 18){
                    list.add(new Person(name, ageNum));
                }

                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Exception: " + e.getMessage());
        }

        Collections.sort(list, Comparator.comparingInt(p -> p.age));

        System.out.println("From list");
        for(Person p : list){
            System.out.println(p.name + " , " + p.age);
        }
    }

}
