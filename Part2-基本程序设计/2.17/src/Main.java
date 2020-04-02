import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temperature in Fahrenheit between -58¨H and 41¨H:");
        double Fahrenheit = input.nextDouble();
        System.out.println("Please the wind speed ( >= 2) in miles per hour:");
        double  speed = input.nextDouble(),
                TheDegreeOfCold = 35.74 + 0.6215 * Fahrenheit - 35.75 * Math.pow(speed , 0.16)
                        + 0.4275 * Fahrenheit * Math.pow(speed , 0.16);
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The wind chill index is " + d.format(TheDegreeOfCold));
    }
}
