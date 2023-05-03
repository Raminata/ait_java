public class Main {
    public static void main(String[] args) {
        /**
         * Создать класс Voter (Избиратель) , содержащий поля имя, адрес,
         * возраст а также конструктор, геттеры и сеттеры. При создании должно
         * быть учтено, что минимальный возраст в Германии для участия в
         * выборах - 16 лет.
         */
        Voter john = new Voter("John", "Boston", 21);
        System.out.println(john.getName());
        System.out.println(john.getAddress());
        System.out.println(john.getAge());

        Voter bill = new Voter();
        bill.setName("Bill");
        bill.setAddress("Boston");
        bill.setAge(14);
        System.out.println(bill.getName());
        System.out.println(bill.getAddress());
        System.out.println(bill.getAge());
    }
}