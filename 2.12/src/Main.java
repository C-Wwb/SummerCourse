import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter speed and acceleration:");
        double  speed = input.nextDouble(),
                acceleration = input.nextDouble(),
                length = Math.pow(speed , 2) / (2 * acceleration);
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The minimum runway length for this airplane is " + d.format(length));
    }
}
