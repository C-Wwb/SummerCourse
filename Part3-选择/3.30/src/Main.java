import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the exchange rate from dollar to RMB: ");
        double rate = input.nextDouble();
        System.out.println("enter 0 to convert dollar to RMB and 1 vice versa:");
        double  option = input.nextDouble();
        DecimalFormat d = new DecimalFormat("0.00");
        if(option == 0)
        {
            System.out.println("Please enter the dollar amount:");
            double dollar = input.nextDouble(),
                   rmb;
            rmb = dollar * rate;
            System.out.println("$" + d.format(dollar) + " is " + d.format(rmb) + " yuan ");
        }
        else if(option == 1)
        {
            System.out.println("Please enter the RMB amount:");
            double rmb = input.nextDouble(),
                   dollar;
            dollar = rmb / rate;
            System.out.println(d.format(rmb) + " yuan " + " is " + "$" + d.format(dollar));
        }
        else
        {
            System.out.println("Incorrect input");
        }
    }
}
