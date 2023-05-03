import java.io.*;

public class Main {
    public static void main(String[] args) //throws IOException
    {

        //ЧТЕНИЕ ИЗ ФАЙЛА

        System.out.println(args[0]);
        //IO Streams
        /**
         * Byte streams (байтовые потоки)   Character streams (символьные стримы)
         * InputStream  OutputStream        Reader           Writer
         * ----------------------------------------------------------------------
         *
         * predefined streams (уже определенные потоки)
         * System.out
         * System.in
         * System.err
         */
        //System.in.read()
        //.read(byte[] data
        byte[] data = new byte[10];
        // System.out.println("Enter something");
        // System.in.read(data);

        System.out.println("You entered ");
        for (int i = 0; i < data.length; i++) {
            //   System.out.println((char) data[i]);

            //чтение из файла через FileInputStream
            //.close()

        }
        int i;
        FileInputStream fin;
        if (args.length != 1) {
            System.out.println("need file name");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        //читаем байты из файла пока не достигнем конца файла
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Error closing file");
        }

        //ЗАПИСЬ В ФАЙЛ
        //FileOutputStream (String fileName)
        //FileOutputStream (String fileName, boolean append)
        //.write()

        // копировать текстовый  файл
        int j;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("TEST.txt");
            fileOutputStream = new FileOutputStream("ToFile.txt");
            do {
                j = fileInputStream.read();
                if (j != -1) fileOutputStream.write(j);
            } while (j != -1);
        } catch (IOException e) {
            System.out.println("I/O Error");
        } finally {
            try {
                if (fileInputStream != null) fileInputStream.close();
            } catch (IOException e) {
                System.out.println("error closing input file");
            }
            try {
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("error closing output file");
            }
        }


        //----------------------------------------------------------
        //FileReader - чтение файла

    }
}