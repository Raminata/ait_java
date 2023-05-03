import java.io.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Написать метод, читающий текстовый файл и возвращающий строку,
         * состояшую из всех прочитанных строчек.
         * Пример: В файле имеется
         * aaa
         * bbbb
         * cc
         * Метод вернет aaa bbbb cc
         */
        File file = new File("eNum.txt");

        String fileContent = readFile(file);
        System.out.println(fileContent);

        /**
         * Есть не пустой текстовый файл такого вида:
         * 1
         * 2
         * 3
         * 4
         * 5
         * Написать метод, возвращаюший среднее арифметическое всех этих чисел.
         */
        File file2= new File("mediumNumber.txt");
        double res = mediumFile(file2);
        System.out.println(res);
    }
    private static double mediumFile(File file) {
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = "";
            int result = 0;
            int numberOfNumber = 0;

            while((line = br.readLine()) != null){
                numberOfNumber++;
                result += Integer.parseInt(line);
            }

            return result / numberOfNumber;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return 0.0;
    }

    private static String readFile(File file) {
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = "";
            String result = "";

            while((line = br.readLine()) != null){
                result += line;
                result += " ";
            }
            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}