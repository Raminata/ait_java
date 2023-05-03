public class Switch1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // 1 - Tram ticketPrice 3.60
        // 2 - S-Bahn ticketPrice 3.80
        // 3 - U-Bahn ticketPrice 3.00
        int choise = 1;
        double bill = 20;

        ticketSale(choise, bill);
    }

    public static double ticketSale(int choise, double bill) {
        double change = 0;
        switch (choise) {
            case 1:
                double priceTram = 3.60;
                System.out.println("Your choise is Tram ticket" + priceTram);
                System.out.println("Here is your change " + change);
                //return change;
                break;
            case 2:
                double priceSbahn = 3.80;
                System.out.println("Your choise is Sbahn ticket prise " + priceSbahn);
                change = bill - priceSbahn;
                System.out.println("Here is your change " + change);
                //return change;
                break;
            case 3:
                double priceUbahn = 3.00;
                System.out.println("Your choise is Ubahn ticket price is " + priceUbahn);
                change = bill - priceUbahn;
                System.out.println("Here is your change " + change);
            default:
                System.out.println("No such ticket");
                //return -1;
                break;
        }
        checkheight(-130);
        return change;
    }

    public static double min(double x, double y) {
        double res = 0;
        if (x < y) {
            res = x;
        } else {
            res = y;
        }
        checkheight(125);
        return res;
    }

    public static void checkheight(double height) {
        if (height < 0) {
            System.out.println("Check your height again");
        }
        if (height >= 0 && height <= 120) {
            System.out.println("Go home");
        }
        if (height > 120 && height <= 140) {
            System.out.println("Goto walk");
        }
        if (height > 140 && height <= 180) {
            System.out.println("You are alian");
        } else {
        }
    }
}
