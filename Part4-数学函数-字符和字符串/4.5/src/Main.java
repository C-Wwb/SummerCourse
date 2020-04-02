import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of sides:");
        int sides = input.nextInt();
        System.out.println("Please enter the side:");
        double side = input.nextDouble(),
               area = ((sides * Math.pow(side,2)) / (4 * Math.tan(Math.PI / sides)));
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The area of the polygon is: " + d.format(area));

    }
}
