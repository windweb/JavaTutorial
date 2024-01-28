import java.util.Scanner;

public class F015_ProjectMortgageCalculator {
    public static void main(String[] args) {
        // Principal: $100,000
        // APR: 3.92
        // Years: 30
        System.out.print("Principal: ");
        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();
        System.out.print("APR: ");
        double apr = input.nextDouble();
        System.out.print("Years: ");
        int years = input.nextInt();
        // mortgage
        double monthlyInterest = apr / 1200;
        double monthlyPayment = principal * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, years * 12));
        double totalPayment = monthlyPayment * years * 12;
        System.out.println("Mortgage: " + totalPayment);
    }
}