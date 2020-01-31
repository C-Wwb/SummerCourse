import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three points:");
        double x1 = input.nextDouble(),
               y1 = input.nextDouble(),
               x2 = input.nextDouble(),
               y2 = input.nextDouble(),
               x3 = input.nextDouble(),
               y3 = input.nextDouble(),
               a = Math.sqrt(Math.pow((y3 - y2),2) + Math.pow((x3 - x2),2)),
               b = Math.sqrt(Math.pow((y3 - y1),2) + Math.pow((x3 - x1),2)),
               c = Math.sqrt(Math.pow((y2 - y1),2) + Math.pow((x2 - x1),2)),
               A = Math.toDegrees(Math.acos((Math.pow(a,2) - Math.pow(b,2) - Math.pow(c,2)) / (-2 * b * c))),
               B = Math.toDegrees(Math.acos((Math.pow(b,2) - Math.pow(a,2) - Math.pow(c,2)) / (-2 * a * c))),
               C = Math.toDegrees(Math.acos((Math.pow(c,2) - Math.pow(b,2) - Math.pow(a,2)) / (-2 * a * b)));
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The three angles are " + d.format(A) + " " + d.format(B) + " " + d.format(C));
    }
}
