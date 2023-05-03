/* Medium - 2 - Zodiac
- Ask the user when he was born?
    - Ask day?
    - Ask month?
- Write for the user the Zodiac sign based on day and month
    - **Aquarius Dates:January 20 – February 18
    - **Pisces Dates:** February 19 – March 20
    - **Aries Dates:March 21 – April 19
    - **Taurus Dates:April 20 – May 20
    - **Gemini Dates:May 21 – June 20
    - **Cancer Dates:June 21 – July 22
    - **Leo Dates: july 23 – 8 22
    - **Virgo Dates:August 23 – September 22
    - **Libra Dates:September 23 – October 22
    - **Scorpio Dates:October 23 – November 21
    - **Sagittarius Dates:November 22 – December 21
    - **Capricorn Dates:December 22 – January 19
- Example
    - Day 26
    - Month 2
    - You are Pisces */

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("___________________________________________________________");
        System.out.println("Do you want to know who you are according to the horoscope?");
        System.out.println("___________________________________________________________");
        System.out.println("When you was born?");
        System.out.print("Day >\t");
        int day = input.nextInt();
        System.out.print("Month > \t");
        int month = input.nextInt();

        //- **Capricorn Dates:December 22 – January 19
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            System.out.println("Capricorn");
        }
        // - **Sagittarius Dates:November 22 – December 21
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            System.out.println("Sagittarius");
        }
        //- **Scorpio Dates:October 23 – November 21
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            System.out.println("Scorpio");
        }
        // - **Libra Dates:September 23 – October 22
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            System.out.println("Libra");
        }
        //- **Virgo Dates:August 23 – September 22
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.println("Virgo");
        }
        //- **Cancer Dates:June 21 – July 22
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            System.out.println("Cancer");
        }
        // - **Gemini Dates:May 21 – June 20
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            System.out.println("Gemini");
        }
        //- **Taurus Dates:April 20 – May 20
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            System.out.println("Taurus");
        }
        //- **Aries Dates:March 21 – April 19
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            System.out.println("Aries");
        }
        // - **Pisces Dates:** February 19 – March 20
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            System.out.println("Pisces");
        }
        //- **Aquarius Dates:January 20 – February 18
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            System.out.println("Aquarius");
        }
        //- **Leo Dates: july 23 – 8 22
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            System.out.println("Leo");
        }

    }
}