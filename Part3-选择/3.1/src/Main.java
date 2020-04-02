import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of circle:");
        double  radius = input.nextDouble(),
                area = Math.PI * Math.pow(radius,2);
        DecimalFormat d = new DecimalFormat("0.00");
        if (radius <= 0)
        {
            System.out.println("Incorrect input");
        }
        else
        {
            System.out.println("Area is " + d.format(area));
        }

    }
}
