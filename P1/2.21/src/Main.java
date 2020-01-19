import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter investment amount:");
        double InvestmentAmount = input.nextDouble();
        System.out.println("Please enter annual interest rate in percentage:");
        double AnnualInterestRate = input.nextDouble();
        System.out.println("Please enter number of years:");
        double  years = input.nextDouble(),
                FutureValue = InvestmentAmount * Math.pow((1 + AnnualInterestRate / 12 / 100) , (years * 12));
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("Future value is $" + d.format(FutureValue));
    }
}
