import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();
        DecimalFormat d = new DecimalFormat("0.00");

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double monthPayment = (loanAmount * monthlyInterestRate) /
                (1 - (1 / Math.pow((1 + monthlyInterestRate) , numberOfYears * 12)));
        double totalPayment = monthPayment * numberOfYears * 12;
        System.out.println("Monthly Payment: " + d.format(monthPayment));
        System.out.println("Total Payment: " + d.format(totalPayment));

        double balance = loanAmount;
        double interest = 0;
        double principal = 0;

        System.out.println("Payment#\tInterest\tPrincipal\tBalance");
        for(int i = 1; i <= numberOfYears * 12; i++)
        {
            interest = monthlyInterestRate * balance;
            principal = monthPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t\t" + d.format(interest) + "\t\t" + d.format(principal)
                    + "\t\t" + d.format(balance));
        }
    }
}
