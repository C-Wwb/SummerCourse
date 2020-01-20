import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter balance and interest rate(e.g., 3 for 3%):");
        double  balance = input.nextDouble(),
                annualInterestRate = input.nextDouble(),
                interest = balance * (annualInterestRate / 1200);
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The interest is " + d.format(interest));

    }
}
