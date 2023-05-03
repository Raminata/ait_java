public class Lession1 {
    public static void main(String[] args) {
        sunIsUp();
        int chickenWeight = 300;
        System.out.println("I'm hungry chicken, I weight" + " " + chickenWeight + " BAWK");
        chickenWeight = eatWorms(4, chickenWeight);
        System.out.println("Bawk-bawk, I had lunch. Now, I weight " + chickenWeight);

        chickenWeight = run(chickenWeight);
        System.out.println("Bawk-bawk-bawk, I'm tired chicken. I weight " + chickenWeight);
        sunIsDown();
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

