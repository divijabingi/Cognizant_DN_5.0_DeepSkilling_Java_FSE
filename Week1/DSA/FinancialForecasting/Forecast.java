import java.util.Scanner;

public class Forecast {

    static double futureVal(double val, double rate, int yrs) {
        if (yrs == 0) {
            return val;
        }
        return futureVal(val * (1 + rate), rate, yrs - 1);
    }

    static void yearlyGrowth(double val, double rate, int year, int yrs) {
        if (year > yrs) {
            return;
        }
        double res1 = val * Math.pow(1 + rate, year);
        System.out.println("Year " + year + " : Rs. " + String.format("%.2f", res1));
        yearlyGrowth(val, rate, year + 1, yrs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double val = sc.nextDouble();

        System.out.print("Enter growth rate: ");
        double rate = sc.nextDouble() / 100;

        System.out.print("Enter years: ");
        int yrs = sc.nextInt();

        System.out.println();
        yearlyGrowth(val, rate, 0, yrs);

        double res = futureVal(val, rate, yrs);

        System.out.println();
        System.out.println("Future Value : Rs. " + String.format("%.2f", res));
        System.out.println("Profit       : Rs. " + String.format("%.2f", res - val));

        sc.close();
    }
}