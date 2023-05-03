import javax.sound.midi.Soundbank;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(30);
        int y = random.nextInt(100);
        //System.out.println("random 30 " + x);
        //System.out.println("random 100 " + y);


        //Exceptions

        int num1 = 8;
        int num2 = 2;
        try {
            int res = num1 / num2;
          //  System.out.println(res);
        } catch (ArithmeticException exception) {
           // System.out.println("do not divide by zero");
           // System.out.println(exception.getMessage());
        }
        //NullPointerException
        // String str = null;
        // System.out.println(str.length());

        //NumberFormatException
        // int num = Integer.parseInt("Hello");

        //ArrayIndexOutOfBoundsException

      //  int[] arr = new int[3];
      //  arr[40] = 10;
        /*Наиболее важные понятия:
        try - код, которвый может вызвать ошибку помещается в try block, который
        передает управление программой в блок catch в случае возник-ия ошибки
        catch - здесь пишется кодб обрабатывающий ошибку если она происходит.
        Этот блок выполняется только если происходит. Если есть catch блок, то
        должен быть выше и try

        finally - этот блок всегда выполняется
        throw - испол-ся для того чтобы бросить исключение (exception)
        throws - исполь-ся в сигнатуре метода и указывает на то что метод
        может бросать исключение

        TRY-CATCH блок
        try{
        команды, которые могут вызвать ошибку
        }catch(Exception e) {
        команды которые выполнятся если ошибка произойдет
        }
        */
        int number1, number2;
        try {
            number1 = 0;
            number2 = 100 / number1;
            System.out.println(number2);
            System.out.println("This is the end of try block");
        } catch (ArithmeticException exception) {
            /*этот блок выполняется только в случае арифметической ошибки*/
            System.out.println("do not divide a number by zero");
        }
        catch (Exception exception) {
            /*это общий обработчик ошибок, т.е он может обраб-ть все ошибки.
            Он выполнится если ошибка не обработана ни одним из предшествующих
            catch блоков*/
            System.out.println("Exception occured");
        }
        System.out.println("Out of try-catch block now");
        /**/
        int[] array = new int[10];

    }
}