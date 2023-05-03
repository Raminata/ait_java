import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Переписать первую задачу из вчерашнего задания с использованием
 * * StringBuilder: Есть текстовый файл. Написать метод, читающий файл и
 * * возвращающий строку, состоящую из строчек этого файла.
 * * Write a method to read a text file into a String using StringBuilder class
 */

public class Letters {
    public static void main(String[] args) {
        String file = "letters.txt";
        String fileContent = readFileToString(file);
        System.out.println(fileContent);
    }

    /**
     * If exception i return null
     *
     * @param filePath
     * @return
     */
    public static String readFileToString(String filePath) {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();
            return sb.toString();
        } catch (IOException ex) {
            return null;
        }
    }

}
