public class Main {
    public static void main(String[] args) {
        int hour = 6;
        boolean musicIsOn = true;
        boolean vasyaIsEngry = musicIsOn && (hour < 7 || hour > 20);
        System.out.println(vasyaIsEngry);
    }
}