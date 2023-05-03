public class Switch {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Petrovich
        double petrovichBalance = 800; //Balance Petrovicha
        int petrovichPin=2545; // PIN Petrovicha
        int petrovichIndex=1;


        //Ivanich
        double ivanichBalance = 10; //Balance Ivanicha
        int ivanichPin=4567; // PIN Ivanicha
        int ivanichIndex=2;

        //ATM (int pin, int clientIndex, int choise, double balance)
        // 1- 50
        // 2- 100
        // 3- 200
        // 4- 500
        // ->index
        // -> check balance
        // return result=balance - amount


        //Check Client - > index + pin
        //Correct -> index
        //Incorrect -> Error -1;
        System.out.println("Ivanich balance before " + ivanichBalance);
        ivanichBalance=atm(ivanichPin,ivanichIndex,3,ivanichBalance);
        System.out.println("Ivanich balance after " + ivanichBalance);



    }

    public static double atm(int pin, int clientIndex, int button, double balance){
        int index=checkClient(clientIndex, pin);
        int amount=0;
        double newBalance=balance;
        if(index<=0 || index>2){
            System.out.println("ERROR Wrong index No such client or wrong pin");
            newBalance=balance;
            return newBalance;
        }

        switch (button){
            case 1:
                amount = 50;
                System.out.println("You withdraw is 50");
                if(balance>=amount){
                    newBalance = balance-amount;
                    System.out.println("You new Balance is " + newBalance);
                    break; //return newBalance;

                }
                else {
                    System.out.println("Operation can't be complited Incorrect balance ");
                    break;
                }
            case 2:
                amount = 100;
                System.out.println("You withdraw is 100");
                if(balance>=amount){
                    newBalance=balance-amount;
                    System.out.println("Your new balance" + newBalance);
                    break; //return newBalance;
                }
                else {
                    System.out.println("Operation can't be coplited Incorrect balance");
                }
            case 3:
                amount = 200;
                System.out.println("You withdraw is 200");
                if (balance>=amount){
                    newBalance=balance-amount;
                    System.out.println("You new Blanace is " +newBalance);
                    break; //return newBalance;
                }
                else {
                    System.out.println(" Operation can't be complited Incorrect balnce");
                    break;
                }
            case 4:
                amount = 500;
                System.out.println("You withdraw is 500");
                if(balance>=amount){
                    newBalance=balance-amount;
                    System.out.println("You new balance is " + newBalance);
                    break; //return newBalance;
                }
                else {
                    System.out.println(" Operation is cant complited Incorrect balance");
                    break;
                }
        }

        return newBalance;

    }

    public static int checkClient(int clientIndex, int pin){
        if(clientIndex==1 && pin == 2545){
            System.out.println("Hello Petrovich!");
            return clientIndex;
        }
        else if(clientIndex==2 && pin == 4567){
            System.out.println("Hello Ivanich");
            return clientIndex;
        }
        else{
            System.out.println("No such client or wrong pin");
            return -1;
        }
    }



}