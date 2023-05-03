package multithreading;

import java.lang.invoke.MutableCallSite;

public class Main {

    //Многопоточность

    /**
     * Многозадачность бывает двух типов:
     * process-based , т.е. когда есть несколько одновременно работающих
     * процессов (программ)
     * thread-based  - когда одна программа выполняется в нескольких потоках
     * <p>
     * Поток может находиться в нескольких состояниях :
     * 1. running -  рабочее состояние, работает
     * 2. ready to run -  готов приступить к работе как только получит доступ к процессору(процессорное время)
     * 3. suspended - работающий поток может быть временно приостановлен
     * 4. blocked -  когда поток не может получить доступ к требуемому ресурсу
     * 5. termintated - выполнение прекращается  и не может быть возобновлено
     * <p>
     * В многопоточности очень важным является вопрос синхронизации. Синхронизация позволяет
     * координировать работу потоков определенным продуманным образом.
     */

    public static void main(String[] args) {
        System.out.println("Main thread starts");

        //I. Interface Runnable

        //создание обекта, ревлизующего интерфайс Runnable
        //MyThread myThread = new MyThread("Thread1");
        //создание потока на этом обьекте
        //Thread newThread = new Thread(myThread);
        //запуск потока
        //newThread.start();

        //создание через класс
        MyThread1 myThread1 = new MyThread1("Thread 1");
        myThread1.start();
        MyThread1 myThread1a = new MyThread1("Thread 1a");
        MyThread1 myThread1b = new MyThread1("Thread 1b");
        myThread1a.start();
        myThread1b.start();

        for (int i = 0; i < 100; i++) {
            System.out.print("#");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("main thread interrupted");
            }
            System.out.println("Main thread ends");
        }

        //II. Сщздание потока через класс Thread
        //- происходит через создание класса расширяющего Thread и переопределения мутода run()

    }
}
