public class HomeworkToLesson6 {
    public static void main(String[] args) {

        int carSpeed = 120;
        int speedLimit = 60;
        int points = 0;
        int fine = 0;

        // speed 0-10 -> 10 Euro  -> *0 points
        // speed 11-20 -> 30 Euro -> *0 points
        // speed 21-30 -> 50 Euro -> *1 point
        // speed 31-100 -> 1000 Euro -> *2 point

        int speedExceeded = carSpeed - speedLimit;

        if (speedExceeded > 0 && speedExceeded < 11) {
            points = 0;
            fine = 10;
        } else if (speedExceeded >= 11 && speedExceeded <= 20) {
            points = 0;
            fine = 30;
        } else if (speedExceeded >= 21 && speedExceeded <= 30) {
            points = 1;
            fine = 50;
        } else if (speedExceeded >= 31) {
            points = 2;
            fine = 1000;
        }
        System.out.println("Your speed was " + carSpeed + " in the zone of limit " + speedLimit);
        System.out.println("You have to pay " + fine + " euro and you will lose " + points + " points");
    }
}