package file_name;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        //1 пишем имя файла, к  которому подключается непосредственно в скобках за ридером
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        //задать
        String fileName = "input.txt";
        reader = new BufferedReader(new FileReader(fileName));

        File file = new File("input.txt");
    }
}
