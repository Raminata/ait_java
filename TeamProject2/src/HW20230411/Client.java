package HW20230411;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 4. *(со звездочкой)
 *  Есть текстовый файл, содержащий информацию о клиенте, название
 * устройства и цену.   Имена клиентов могут повторяться.
 * Файл имеет такой вид:
 * John, Smith, Notebook, 500
 * Jill, White, Mac,  800
 * John, Smith, Keybord,25
 * Ann, Green, Mousepad, 5
 * Jill, White, Apple,60
 * Написать метод, читающий информацию из файла, суммирующий
 * цену для каждого покупателя  и записывающий результат в выходной
 * файл. Этот файл будет иметь такой вид:
 * Ann Green 5
 * John Smith 525
 * Jill White 860
 * Для решения задач вам могут понадобиться также методы класса
 * String  trim()  и split().  Найти о них информацию в интернете.
 */
public class Client {
    String name;
    String surname;
    String device;
    int price;

    public Client(String name, String surname, String device, int price) {
        this.name = name;
        this.surname = surname;
        this.device = device;
        this.price = price;
    }

    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();

        System.out.println("From file");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("client.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);

                String[] parts = line.split(",");
                Client client = new Client(parts[0].trim(), parts[1].trim(), parts[2].trim(), Integer.parseInt(parts[3].trim()));
                System.out.println(client.name + " " + client.surname + " " + client.device + " " + client.price);
                clients.add(client);

                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Exception: " + e.getMessage());
        }

        // sort by price
        Collections.sort(clients, Comparator.comparingInt(o -> o.price));

        System.out.println("From list");
        // print list
        for (Client client : clients) {
            System.out.println(client.name + " " + client.surname + " " + client.device + " " + client.price);
        }
    }
}
