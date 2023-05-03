/*
Задача 2. (тренируем switch - case)
Вы гуляете со своим животным и оно проголодалось. У вас с собой есть
99 долларов.
Вы хотите его накормить и видите рядом автомат с кормом для
4 разных животных (кот, собака, мышь, хрюшка) а также универсальный
корм для других животных.
Стоимость кормов (за 1 упаковку):
1) для кота - 14 долларов
2) для собаки - 23 доллара
3) для мыши - 6 долларов
4) для хрюшки - 132 доллара
default) универсальный корм - 20 долларов

Задача - при выборе типа животного, рассчитать сколько упаковок корма
Вы сможете купить на 99 долларов и сколько денег у Вас останется после
покупки.
Примечание: вывести в консоль в виде текста:
- тип выбранного животного,
- стоимость корма для него за 1 упаковку,
- количество купленных упаковок,
- оставшуюся сумму денег.

Если кто-то хочет усложнить эту задачу, то попробуйте решить её со
стоимостью корма для кота 14.35 $ (т.е дробным, а не целым числом)
Удачи!
*/

public class Switch4 {
    public static void main(String[] args) {
        double myMoney = 99;
        String myPet = "cat";
        double price = 0;
        switch (myPet) {
            case "cat":
                price = 14.35;
                break;
            case "dog":
                price = 23;
                break;
            case "mouse":
                price = 6;
                break;
            case "pig":
                price = 132;
                break;
            default:
                price = 20;
                break;
        }
        int amount = (int) (myMoney / price);
        double change = amount * price;
        change = myMoney - change;

        System.out.println("My pet is " + myPet);
        System.out.println("Price is " + price);
        System.out.println("You can buy " + amount);
        System.out.println("Your change " + change);
    }
}

