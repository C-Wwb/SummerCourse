import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the monthly saving amount and month:");
        double  amount = input.nextDouble(),
                month = input.nextDouble(),
                AnnualInterestRate = 0.05,
                MonthlyInterestRate = AnnualInterestRate / 12,
                FinalMount = 0;
        DecimalFormat d = new DecimalFormat("0.00");
        for(int i = 1 ; i <= month ; i++)
        {
            double  n = 1 + MonthlyInterestRate;
            FinalMount = (FinalMount + amount) * n;
            System.out.println("After the " + i + " month, the account value is $" + d.format(FinalMount));
        }
    }
}
