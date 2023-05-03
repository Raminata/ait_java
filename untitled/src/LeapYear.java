public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 0) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }
        return year % 4 ==0;
    }

    public static void main(String[] args) {

    }
}
