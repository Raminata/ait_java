/* Medium - 3

- ask the user  any whole number - x
- print a table of  number from 0 to x as a table with number and square and cube
- example for 3:
    - Enter number
    - 3
    - 1 \t 1 \t 1
    - 2 \t 4 \t 8
    - 3 \t 9 \t 27 */

import java.util.Scanner;

public class Magic8ball {
    public static void main(String[] args) {
        magic8ball();
    }

    public static void magic8ball() {
        double x = Math.random();

        int max = 19; // верхняя граница
        int min = 0;
        int randomNumber = (int) (min + Math.random() * (max - min + 1)); //
        // идемпотентность - когда мы можем менять и разультат не меняется

        // здесь пишите решение
        //
        String[] answers = {
                "It is certain (Бесспорно)",
                "It is decidedly so (Предрешено)",
                "Without a doubt (Никаких сомнений)",
                "Yes — definitely (Определённо да)",
                "You may rely on it (Можешь быть уверен в этом)",
                "As I see it, yes (Мне кажется — «да»)",
                "Most likely (Вероятнее всего)",
                "Outlook good (Хорошие перспективы)",
                "Signs point to yes (Знаки говорят — «да»)",
                "Yes (Да)",
                "Reply hazy, try again (Пока не ясно, попробуй снова)",
                "Ask again later (Спроси позже)",
                "Better not tell you now (Лучше не рассказывать)",
                "Cannot predict now (Сейчас нельзя предсказать)",
                "Concentrate and ask again (Сконцентрируйся и спроси опять)",
                "Don’t count on it (Даже не думай)",
                "My reply is no (Мой ответ — «нет»)",
                "My sources say no (По моим данным — «нет»)",
                "Outlook not so good (Перспективы не очень хорошие)",
                "Very doubtful (Весьма сомнительно)"
        };
        String color = "red";

        if (randomNumber >= 0 && randomNumber < 5) {
            color = "blue";
        }
        if (randomNumber >= 5 && randomNumber < 10) {
            color = "green";
        }
        if (randomNumber >= 10 && randomNumber < 15) {
            color = "yellow";
        }
        if (randomNumber >= 15) {
            color = "red";
        }
        System.out.println(answers[randomNumber] + " Color: " + color);

    }
}