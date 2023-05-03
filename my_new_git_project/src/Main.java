import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        file.createNewFile();
        FileReader fileReader = new FileReader(file);

    }
    /**
     * написать метод, который читает из файла два числа и записывает во
     * второй файл их сумму а также выводит ее на экран
     * их сумму
     * Integer.parseInt("2");
     * public static void sum (String fileIn,String fileOut)
     */

}