import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Marco", 80));
        list.add(new Person("Nick", 32));
        list.add(new Person("Johana", 20));
        list.add(new Person("John", 40));
        list.add(new Person("Ekaterina", 12));

        try (FileWriter writer = new FileWriter("persons.txt");
             BufferedWriter bw = new BufferedWriter(writer)) {

            for (Person p : list) {
                bw.write(p.toString());
                bw.write("\n");

            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("persons.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Exception: " + e.getMessage());
        }

    }

}
