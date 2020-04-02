import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the bounding circle:");
        double  radius = input.nextDouble(),
                x1 = 0,
                y1 = radius,
                x2 = radius * Math.cos(Math.toRadians(162)),
                y2 = radius * Math.sin(Math.toRadians(162)),
                x3 = radius * Math.cos(Math.toRadians(234)),
                y3 = radius * Math.sin(Math.toRadians(234)),
                x4 = radius * Math.cos(Math.toRadians(306)),
                y4 = radius * Math.sin(Math.toRadians(306)),
                x5 = radius * Math.cos(Math.toRadians(378)),
                y5 = radius * Math.sin(Math.toRadians(378));
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The coordinate of five points on the pentagon are:\n(" + x1 + ", " + y1 + ")\n"
        + "("+ d.format(x2) + ", " + d.format(y2) + ")\n"
        +"("+ d.format(x3) + ", " + d.format(y3) + ")\n"
        +"("+ d.format(x4) + ", " + d.format(y4) + ")\n"
        +"("+ d.format(x5) + ", " + d.format(y5) + ")\n");

    }
}
