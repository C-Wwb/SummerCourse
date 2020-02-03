import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double  alpha1 = Math.toRadians(Math.random() * 365),
                alpha2 = Math.toRadians(Math.random() * 365),
                alpha3 = Math.toRadians(Math.random() * 365),
                r = 40,
                x1 = r * Math.cos(alpha1),
                y1 = r * Math.sin(alpha1),
                x2 = r * Math.cos(alpha2),
                y2 = r * Math.sin(alpha2),
                x3 = r * Math.cos(alpha3),
                y3 = r * Math.sin(alpha3),

                a = Math.sqrt(Math.pow((y3 - y2),2) + Math.pow((x3 - x2),2)),
                b = Math.sqrt(Math.pow((y3 - y1),2) + Math.pow((x3 - x1),2)),
                c = Math.sqrt(Math.pow((y2 - y1),2) + Math.pow((x2 - x1),2)),

                A = Math.toDegrees(Math.acos((Math.pow(a,2) - Math.pow(b,2) - Math.pow(c,2)) / (-2 * b * c))),
                B = Math.toDegrees(Math.acos((Math.pow(b,2) - Math.pow(a,2) - Math.pow(c,2)) / (-2 * a * c))),
                C = Math.toDegrees(Math.acos((Math.pow(c,2) - Math.pow(b,2) - Math.pow(a,2)) / (-2 * a * b)));
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The readings for the three angles are: \n" + d.format(A) + " " + d.format(B) + " " + d.format(C));
    }
}
