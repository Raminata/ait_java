public class IfElse1 {
    public static void main(String[] args) {
        int number = -400;
        more200(number);
        //  Пользователь вводит число
        // если оно больше 200, выводим "+"
        // если оно меньше -200, выводим "-"
        // если оно между - выводим "ок" между 200 и -200 включетльно
    }

    public static void more200(int input) {
//        if (input > 200) {
//            System.out.println("+");
//        }
//        if (input < -200) {
//            System.out.println("-");
//        }
//        if (input <= 200 && input >= -200 ){
//            System.out.println("ок");
//        }
        if (input > 200) {
            System.out.println("+"); // код читается толькое первое условие выполняется
        } else if (input < -200) {
            System.out.println("-"); // код читается, первое не выполняется, а второе условие выполяется
        } else {
            System.out.println("ок"); // код читается, если оба условия ложны
        }
    }

}


