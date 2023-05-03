import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        FileReader fileReader = new FileReader("text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int c;
        //c = (char) bufferedReader.read();
        while (bufferedReader.read() != -1) {
            c = bufferedReader.read();
            System.out.println(c);
        }

    }
}