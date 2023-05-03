package HW20230411;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 1. Есть  текстовый файл.  Написать метод,  читающий файл и
 * * возвращающий строку, состоящую из строчек этого файла,
 * * разделенных пробелом.
 * * Пример текстового файла:
 * * c
 * * bbbbbbb
 * * cc
 * *  результат : aaa bbbbbbb cc
 */

public class Letters {

    public Letters(String letters) {
    }

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("letter.txt"));
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
