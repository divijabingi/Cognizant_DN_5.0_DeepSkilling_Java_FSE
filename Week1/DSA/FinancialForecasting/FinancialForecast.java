import java.util.Scanner;

public class FinancialForecast {

    // Recursive method to calculate future value
    // Base case: when years = 0, return the current value
    // Recursive case: grow by one year and call again
    static double futureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return futureValue(amount * (1 + rate), rate, years - 1);
    }

    // Recursive method to print value year by year
    static void printYearly(double amount, double rate, int year, int totalYears) {
        if (year > totalYears) {
            return;
        }
        double value = amount * Math.pow(1 + rate, year);
        System.out.printf("Year %d: Rs. %.2f%n", year, value);
        printYearly(amount, rate, year + 1, totalYears);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter annual growth rate (e.g. 10 for 10%): ");
        double rate = sc.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        System.out.println("\n--- Year by Year Growth ---");
        printYearly(amount, rate, 0, years);

        double result = futureValue(amount, rate, years);
        System.out.printf("%nFuture Value after %d years: Rs. %.2f%n", years, result);
        System.out.printf("Total Profit: Rs. %.2f%n", result - amount);

        sc.close();
    }
}
