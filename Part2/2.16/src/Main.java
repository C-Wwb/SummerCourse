import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the side:");
        double  side = input.nextDouble(),
                area = Math.sqrt(3) * 3 / 2 * Math.pow(side , 2);
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The area of the hexagon is " + d.format(area));

    }
}
