package our.interfaces.series;

public class Main {
    public static void main(String[] args) {
        Twos two = new Twos();
        //Series two1 = new Twos();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is: " + two.getNext());
        }
        System.out.println("\nResetting");
        two.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + two.getNext());
        }

        System.out.println("\nStarting at 100");
        two.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + two.getNext());
        }
        Twos twos = new Twos();
        Threes threes = new Threes();
        Series series;

        series = twos;
        series = threes;
        Series series1 = new Twos();
        Series series2 = new Threes();


        /*List list = new ArrayList<>();
        List list1 = new LinkedList();
        LinkedList linkedList = new LinkedList();*/

    }
}
