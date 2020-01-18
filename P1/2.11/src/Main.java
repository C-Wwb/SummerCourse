import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of years:");
        double  years = input.nextDouble(),
                PopulationBase = 312032486,
                TotalSeconds = years * 365 * 24 * 60 * 60,
                Birth = TotalSeconds / 7,
                Death = TotalSeconds / 13,
                Immigration = TotalSeconds / 45,
                NowPopulation = PopulationBase + Birth + Immigration - Death;
        DecimalFormat d = new DecimalFormat("0");
        System.out.println("The population in " + years + " years is " + d.format(NowPopulation));
    }
}
