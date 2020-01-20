import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the driving distance:");
        double DrivingDisance = input.nextDouble();
        System.out.println("Please enter miles per gallon:");
        double MilesPerGallon = input.nextDouble();
        System.out.println("Please enter price per gallon:");
        double  PricePerGallon = input.nextDouble(),
                cost = DrivingDisance / MilesPerGallon * PricePerGallon;
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The cost driving is $" + d.format(cost));
    }
}
