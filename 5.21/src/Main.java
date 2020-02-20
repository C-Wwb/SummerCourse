import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount:");
        double loanAmount = input.nextDouble();
        System.out.println("Number of Years:");
        int numberOfYears = input.nextInt();
        double annualInterestRate = 5;
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double monthlyPayment = 0;
        DecimalFormat r = new DecimalFormat("0.000");
        DecimalFormat d = new DecimalFormat("0.00");


        System.out.println("Interest Rate          Monthly Payment          Total Payment");
        for(annualInterestRate = 5; annualInterestRate <= 8; annualInterestRate += 0.125)

            System.out.println(r.format(annualInterestRate) + "%");


        for(monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow((1 + monthlyInterestRate),numberOfYears * 12)))
         ; monthlyPayment <= 202.76; monthlyPayment += monthlyPayment * monthlyInterestRate)

            System.out.println(d.format(monthlyPayment));


        for(double totalPayment = monthlyPayment * numberOfYears * 12; totalPayment <= 13000
                ; totalPayment += totalPayment * annualInterestRate)

            System.out.println(d.format(totalPayment));

    }
}
