package HW20230411;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * 2. Есть  файл, состоящий из строчек текста.  Написать метод,
 * * читающий файл и находящий самую длинную строчку в этом файле.
 * * Метод возвращает эту строчку
 * * Пример текстового файла:
 * * aaa
 * * bbbbbbb
 * * cc
 * *  результат :  bbbbbbb
 */
public class LongLetter {

    public static void main(String[] args) {

        try {
            String longest = "";

            BufferedReader reader = new BufferedReader(new FileReader("letters.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
                if(line != null && line.length() > longest.length()){
                    longest = line;
                }
            }

            reader.close();

            System.out.println("longest is " + longest);
        } catch (IOException e) {
            System.err.println("Exception: " + e.getMessage());
        }

    }

}
