import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length from the center to a vertex:");
        double  r = input.nextDouble(),
                s = 2 * r * Math.sin(Math.PI / 5),
                area = ((5 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 5)));
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The area of the pentagon is " + d.format(area));
    }
}
