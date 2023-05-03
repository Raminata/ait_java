import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of money: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the currency you have (USD, EUR, GBP, or RUB): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the currency you want to exchange to (USD, EUR, GBP, or RUB): ");
        String toCurrency = scanner.next().toUpperCase();

        // Exchange rates
        double usdRate = 1.0;
        double eurRate = 0.82;
        double gbpRate = 0.72;
        double rubRate = 73.5;

        // Convert the amount to USD
        double usdAmount = 0.0;
        switch (fromCurrency) {
            case "USD":
                usdAmount = amount;
                break;
            case "EUR":
                usdAmount = amount / eurRate;
                break;
            case "GBP":
                usdAmount = amount / gbpRate;
                break;
            case "RUB":
                usdAmount = amount / rubRate;
                break;
            default:
                System.out.println("Invalid input for the currency you have");
                return;
        }

        // Convert from USD to the desired currency
        double result = 0.0;
        switch (toCurrency) {
            case "USD":
                result = usdAmount;
                break;
            case "EUR":
                result = usdAmount * eurRate;
                break;
            case "GBP":
                result = usdAmount * gbpRate;
                break;
            case "RUB":
                result = usdAmount * rubRate;
                break;
            default:
                System.out.println("Invalid input for the currency you want to exchange to");
                return;
        }

        System.out.printf("You will receive %.2f %s\n", result, toCurrency);
    }
}