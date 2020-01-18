import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of water in kilograms:");
        double M = input.nextDouble();
        System.out.println("Please enter initial temperature:");
        double InitialTemperature = input.nextDouble();
        System.out.println("Please enter final temperature:");
        double  FinalTemperature = input.nextDouble(),
                Q = M * (FinalTemperature - InitialTemperature) * 4184;
        DecimalFormat d = new DecimalFormat("0.0");
        System.out.println("The energy needed is " + d.format(Q));

    }
}
