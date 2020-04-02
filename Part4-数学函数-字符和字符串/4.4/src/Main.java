import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the side:");
        double side = input.nextDouble(),
               area = ((6 * Math.pow(side,2)) / (4 * Math.tan(Math.PI / 6)));
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The area of the hexagon is: " + d.format(area));
    }
}
