/*Homework

### Задание 2

Напишите метод tossCoin(), который бы случайным образом выводил
бы в консоль одно из значений: "head", "tail". (
прим. tossCoin - бросать монетку, head - орел, tail- решка)*/


public class Homework7 {
    public static void main(String[] args) {
        int max = 1;
        int min = 0;
        int tossCoin = (int) (min + Math.random() * (max - min + 1));
        if (tossCoin == 1) {
            System.out.println("head ");
        } else {
            System.out.println("tail ");
        }
    }

}

