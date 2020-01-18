import java.text.DecimalFormat;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please input the radius and length of a cylinder:");
        Scanner input = new Scanner(System.in);
        double  radius = input.nextDouble(),
                length = input.nextDouble();

        double  area = Math.PI * Math.pow(radius,2),
                perimeter = 2 * Math.PI * radius,
                SuperficialArea =(area  * 2) + perimeter * length,
                Volume = area * length;

        DecimalFormat d = new DecimalFormat("0.00");

        System.out.println("The area is: " + d.format(area) +
                "\nThe SuperficialArea is: " + d.format(SuperficialArea) +
                "\nThe Volume is: " + d.format(Volume));
    }
}
