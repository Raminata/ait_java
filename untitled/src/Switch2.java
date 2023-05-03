public class Switch2 {
    public static void main(String[] args) {
    /*
     * int budgets = 99;
        System.out.println("I have " + budgets);
     */

        anim(2);
    }

    static void anim(int eatany) {
        int cats = 14;
        int dogs = 23;
        int mouss = 6;
        int swings = 132;
        int alls = 20;
        switch (eatany) {
            case 1://cat
                System.out.println("it is for cat ");
                print(cats);
                break;
            case 2://dog
                System.out.println("it is for dog ");
                print(dogs);
                break;
            case 3://mous
                System.out.println("it is for mous ");
                print(mouss);
                break;
            case 4://swing
                System.out.println("it is for swimg ");
                print(swings);
                break;
            default:
                System.out.println("You perets its not hier ");
                print(alls);
                break;
        }
    }

    private static void print(int animal) {
        System.out.println("price ist " + animal + " dollar");
        System.out.println("can buy " + 99 / animal + " packages");
        System.out.println("i have left " + (99 - (99 / animal) * animal) + " dollars");
    }
}