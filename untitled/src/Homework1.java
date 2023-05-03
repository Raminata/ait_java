/*
Задача 3. Таможня.
Вы хотите закупить товары для Вашей фирмы и затем продать их.
Список товаров и их стоимость продажи в Вашем магазине:
1) Пылесосы - 95.50 $
2) Стиральные машины - 349 $
3) Кофеварки - 39.99 $
4) Холодильники - 599 $

Вы работаете с 3 поставщиками. Китай, США и Япония.
У каждой страны разные цены на товары и разные таможенные условия.

1) Китай
Пылесосы - 58.25 $
Стиральные машины - 282 $
Кофеварки - 24.25 $
Холодильники - 375 $
- таможенный сбор с общей суммы закупки 7%
- дополнительный сбор 7.50 $ с каждой единицы товара (считается после уплаты таможенного сбора)

2) США
Пылесосы - 65.50 $
Стиральные машины - 219 $
Кофеварки - 27 $
Холодильники - 444 $
- отсутствует сбор с общей суммы закупки
- таможенный сбор 15.25 $ с каждой единицы товара
- особые условия. США возвращает 11,5% от уплаченного Вами таможенного сбора, обратно на ваш банковский счет

3) Япония
Пылесосы - 82.55 $
Стиральные машины - 299.99 $
Кофеварки - 25 $
Холодильники - 500.50 $
- отсутствует сбор за единицу товара
- таможенный сбор с общей суммы закупки 9%
- фиксированная таможенная пошлина 10.000 $*
-------
Условия
-------
У вас на счету 250'000 $.
Вы можете купить только 1 тип товара в одной из стран.
Вам необходимо рассчитать и вывести в консоль:
- максимально возможное количество выбранного товара, которое можно купить на Ваши деньги в указанной стране
- общая сумма закупки
- сумма таможенных сборов (можно общим числом, либо расписать подробнее на составляющие, если хотите)
- конечная себестоимость 1 ед. товара (цена закупки + таможенный сбор в расчёте на 1 ед. товара)
- сумма денег оставшаяся на Вашем счету после покупки (будьте внимательны с США)
- конечная общая прибыль, при условии, что Вы продадите 100% всех закупленных товаров по указанной в Вашем магазине
цене

*Примечание1:
постарайтесь при решении использовать всё то, что мы учили, а именно:
- вызовы методов(функций) с передачей в них переменных
- switch/case

*Примечение2:
Кому этого мало, можно немного усложнить условие. В Китае размер дополнительного сбора зависит от стоимости за единицу
товара.
Если меньше или равно 100 $ - то сбор 7.50 $
Если больше 100 $ - то сбор 12.50 $

*Примечание3:
Все имена и персонажи выдуманы, любые совпадения случайны.
Задачу писал второпях, поэтому все цифры взяты с потолка, в описанных условиях отсутствует здравый смысл и логика и
эти условия не имеют ничего общего с реальной жизнью. Но для задачи сойдёт))
Задача объёмная, но для нас уже решаемая. Думаю код получится немаленьким.
Если есть вопросы, по условиям самой задачи или что-то непонятно, спрашивайте, не стесняйтесь.
Просьба свой код скидывать в виде ссылок, либо внутри файлов .txt. Не засоряйте общий чат стеной кода.
Удачи!
*/

public class Homework1 {

    public static void main(String[] args) {
        String myItem = "Vacuum cleaners";
        String mySupplier = "Japan";

        double itemPrice = getMyItemPrice(myItem);
        double supplierPrice = getSupplierPrice(myItem, mySupplier);
        double importTaxTotalProCent = 0;
        double importTaxPerItem = 0;
        double returnTaxTotalProCent = 0;
        double fixedTax = 0;
        double myMoney = 250000;

        System.out.println("My store sells " + myItem);
        System.out.println("I sell for price $" + itemPrice);
        System.out.println("My supplier is " + mySupplier);

        switch (mySupplier) {
            case "China":
                importTaxTotalProCent = 0.07;
                importTaxPerItem = 7.5;

                double priceWithTaxChina = (supplierPrice + importTaxPerItem) * (1 + importTaxTotalProCent);
                int quantityChina = (int) (myMoney / priceWithTaxChina);
                double sumPriceWithTaxChina = quantityChina * priceWithTaxChina;
                double sumPriceWithoutTaxChina = quantityChina * supplierPrice;
                double totalTaxChina = sumPriceWithTaxChina - sumPriceWithoutTaxChina;
                double moneyLeftChina = myMoney - sumPriceWithTaxChina;
                double profitChina = itemPrice * quantityChina;
                System.out.println("I can buy " + quantityChina + " pieces");
                System.out.printf("Item price to pay is $%.2f\n", priceWithTaxChina);
                System.out.printf("Total price to pay is $%.2f\n", sumPriceWithTaxChina);
                System.out.printf("Total tax to pay is $%.2f\n", totalTaxChina);
                System.out.printf("Money left is $%.2f\n", moneyLeftChina);
                System.out.printf("Profit is $%.2f\n", profitChina);
                break;
            case "USA":
                importTaxTotalProCent = 0;
                importTaxPerItem = 15.25;
                returnTaxTotalProCent = 0.115;

                double priceWithTaxUsa = (supplierPrice + importTaxPerItem) * (1 + importTaxTotalProCent);
                int quantityUsa = (int) (myMoney / priceWithTaxUsa);
                double sumPriceWithTaxUsa = quantityUsa * priceWithTaxUsa;
                double sumPriceWithoutTaxUsa = quantityUsa * supplierPrice;
                double totalTaxUsa = sumPriceWithTaxUsa - sumPriceWithoutTaxUsa;
                double moneyLeftUsa = (myMoney - sumPriceWithTaxUsa) + (sumPriceWithTaxUsa * returnTaxTotalProCent);
                double profitUsa = itemPrice * quantityUsa;

                System.out.println("I can buy " + quantityUsa + " pieces");
                System.out.printf("Item price to pay is $%.2f\n", priceWithTaxUsa);
                System.out.printf("Total price to pay is $%.2f\n", sumPriceWithTaxUsa);
                System.out.printf("Total tax to pay is $%.2f\n", totalTaxUsa);
                System.out.printf("Money left is $%.2f\n", moneyLeftUsa);
                System.out.printf("Profit is $%.2f\n", profitUsa);
                break;
            case "Japan":
                importTaxPerItem = 0;
                importTaxTotalProCent = 0.09;
                fixedTax = 10000;
                double priceWithTaxJapan = (supplierPrice + importTaxPerItem) * (1 + importTaxTotalProCent);
                int quantityJapan = (int) ((myMoney-10000) / priceWithTaxJapan);
                double sumPriceWithTaxJapan = quantityJapan * priceWithTaxJapan +10000;
                double sumPriceWithoutTaxJapan = quantityJapan * supplierPrice;
                double totalTaxJapan = sumPriceWithTaxJapan - sumPriceWithoutTaxJapan;
                double moneyLeftJapan = myMoney - sumPriceWithTaxJapan;
                double profitJapan = itemPrice * quantityJapan;
                System.out.println("I can buy " + quantityJapan + " pieces");
                System.out.printf("Item price to pay is $%.2f\n", priceWithTaxJapan);
                System.out.printf("Total price to pay is $%.2f\n", sumPriceWithTaxJapan);
                System.out.printf("Total tax to pay is $%.2f\n", totalTaxJapan);
                System.out.printf("Money left is $%.2f\n", moneyLeftJapan);
                System.out.printf("Profit is $%.2f\n", profitJapan);
                break;
            default:
                break;
        }
    }

    static double getMyItemPrice(String myItem){
        switch (myItem) {
            case "Vacuum cleaners":
                return 95.50;
            case "Washing machines":
                return 349;
            case "Coffee makers":
                return 39.99;
            case "Refrigerators":
                return 599;
            default:
                break;
        }
        return 0;
    }


    static double getSupplierPrice(String myItem, String mySupplier) {
        switch (mySupplier) {
            case "China":
                switch (myItem) {
                    case "Vacuum cleaners":
                        return 58.25;
                    case "Washing machines":
                        return 282;
                    case "Coffee makers":
                        return 24.25;
                    case "Refrigerators":
                        return 375;
                    default:
                        break;
                }

            case "USA":
                switch (myItem) {
                    case "Vacuum cleaners":
                        return 65.50;
                    case "Washing machines":
                        return 219;
                    case "Coffee makers":
                        return 27;
                    case "Refrigerators":
                        return 444;
                    default:
                        break;
                }

            case "Japan":
                switch (myItem) {
                    case "Vacuum cleaners":
                        return 82.55;
                    case "Washing machines":
                        return 299.99;
                    case "Coffee makers":
                        return 25;
                    case "Refrigerators":
                        return 500.50;
                    default:
                        break;
                }
            default:
                break;
        }

        return 0;
    }
}