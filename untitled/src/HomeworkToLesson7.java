public class HomeworkToLesson7 {
    public static void main(String[] args) {

        // bankomat

        // mina tu tipkaj kaj prvo stisnes
        System.out.println("Welcome to ATM Raminata");
        System.out.println(" What do you want to do ?");
        System.out.println(" 1 - Print your money in acocunt");
        System.out.println(" 2 - take your money out from account");

        int dengi = 500;
        int button = 0;

        // raminata sada stiska na ekran button 1
        button = 1;
        System.out.println(" ja hocu " + button);

        if (true) {
            System.out.println("mina??");
        } else {
            if (button == 1) {
                System.out.println("Raminata, ti bogata, u tebe " + dengi + " EURO");
            }

            if (button == 2) {
                System.out.println("Raminata, koliko dengi oces van?");

                int drugiButton = 50;
                System.out.println(" ja hocu " + drugiButton);

                if (drugiButton > 20) {
                    System.out.println("Ramianta, ja nemam toliko dengi v bnakoati");
                }

                drugiButton = 15;
                System.out.println(" ja hocu " + drugiButton);

                System.out.println("Ja tebi dajem " + drugiButton + " euro van");
                int novoStanje = dengi - drugiButton;
                System.out.println(" u tebe sad ostalo " + novoStanje + " euro");
                System.out.println(" ne zaboravi uzeti karticu , book");
            }

            if (button == 1) {
                System.out.println("whauu jel to moguc?");
            }
        }

    }
}