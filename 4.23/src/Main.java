import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter employee`s name:");
        String name = input.next();
        System.out.println("Please enter of hours worked in a week:");
        double hours = input.nextDouble();
        System.out.println("Please enter hourly pay rate:");
        double hourlyPayRate = input.nextDouble();
        System.out.println("Please enter federal tax withholding rate:");
        double federalRate = input.nextDouble();
        System.out.println("Please enter state tax withholding rate:");
        double stateRate = input.nextDouble();
        DecimalFormat d = new DecimalFormat("0.00");
        double grossPay = hours * hourlyPayRate,
               federalWithholding = grossPay * 0.2,
               stateWithholding = grossPay * 0.09,
               totalDeduction = federalWithholding + stateWithholding,
               netPay = grossPay - totalDeduction;
        System.out.println("Employee Name: " + name + "\nHours Worked: " + d.format(hours)
                + "\nPay Rate: $" + hourlyPayRate + "\nGross Pay: $" + d.format(grossPay)
         + "\nDeductions:\n  Federal Withholding (20.0%): $" + d.format(federalWithholding)
                + "\n  State Withholding (9.0%): $" + d.format(stateWithholding)
                + "\n  Total Deduction: $" + d.format(totalDeduction) + "\nNet Pay: $" + d.format(netPay));
    }
}
