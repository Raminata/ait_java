import java.io.*;

public class Main {
    public static void main(String[] args) {


        //чтение по символам методом read
        try (FileReader fileReader = new FileReader("input.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.getMessage();
        }
        System.out.println("readLine");


        //чтение по строкам методом readLine
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        //запись символов в файл путем BufferedWriter
        try (FileWriter fileWriter = new FileWriter("output.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String string = "Hello World";
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //считывание с клавиатуры в файл
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(inputStreamReader);
             BufferedWriter bw = new BufferedWriter(new FileWriter("fromConsole.txt", true))){
            //читает по строкам
            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("STOP")) {
                bw.write(line + "\n");
                bw.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}