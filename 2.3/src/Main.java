import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please input feet:");
        Scanner input = new Scanner(System.in);
        double  feet = input.nextDouble(),
                meters = feet * 0.305;

        DecimalFormat d = new DecimalFormat("0.00");

        System.out.println(d.format(feet) + " feet is " + d.format(meters) + " meters");


    }
}
