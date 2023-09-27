package Lesson4;
import java.util.Scanner;

public class L4E3 {
    public static void main(String[] args) {
        Scanner LoanAmount = new Scanner(System.in);
        System.out.print("Loan amount: ");
        int L = LoanAmount.nextInt();

        Scanner InterestRate = new Scanner(System.in);
        System.out.print("Interest Rate (APR %): ");
        int j = InterestRate.nextInt();

        Scanner NumberOfYears = new Scanner(System.in);
        System.out.print("Number of years: ");
        int n = NumberOfYears.nextInt();

        Scanner MonthlyPayment = new Scanner(System.in);
        System.out.print("Monthly payment for this loan: ");
        int M = MonthlyPayment.nextInt();




    }
}
