import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final double annualGrowthRate = 0.05;
        DecimalFormat d = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the tuition fees:");
        double tuitionFees = input.nextDouble();
        double totalTuitionFees = 0;
        for(int year = 1; year < 100; year++)
        {
            if(year <= 10)
            {
                tuitionFees += tuitionFees * annualGrowthRate;
                totalTuitionFees += tuitionFees;
            }
            else
            {
                break;
            }
        }
        System.out.println("Tuition after 10 years: " + d.format(tuitionFees));
        System.out.println("Total tuition within 10 years: " + d.format(totalTuitionFees));
    }
}
