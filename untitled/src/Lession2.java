public class Lession2 {
    public static void main(String[] args) {
        sunIsUp();
        int chickenWeight = 300;
        System.out.println("I'm3333333333333333333333333333333 hungry chicken, I weight" + " " + chickenWeight + " BAWK");

    }

    static void sunIsUp() {
        System.out.println("Sun is up!");
    }

    static void sunIsDown(){
        System.out.println("Sun is down!");
    }
    static int run(int oldWeight) {
        int newWeight = oldWeight - 20;
        return newWeight;
    }
    static int eatWorms(int numberOfWorms, int oldWeight) {
        int newWeight = oldWeight + (numberOfWorms * 50);
        return newWeight;
    }


}

