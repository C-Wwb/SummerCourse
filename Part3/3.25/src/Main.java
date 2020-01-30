import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter x1,y1,x2,y2,x3,y3,x4,y4:");
        double  x1 = input.nextDouble(),
                y1 = input.nextDouble(),
                x2 = input.nextDouble(),
                y2 = input.nextDouble(),
                x3 = input.nextDouble(),
                y3 = input.nextDouble(),
                x4 = input.nextDouble(),
                y4 = input.nextDouble(),
                a = y1 - y2,
                b = -(x1 - x2),
                e = (y1 - y2) * x1 - (x1 - x2) * y1,
                c = y3 - y4,
                d = -(x3 - x4),
                f = (y3 - y4) * x3 - (x3 - x4) * y3,
                xCoordinate = ((e * d) - (b * f)) / ((a * d) - (b * c)),
                yOrdinate = ((a * f) - (e * c)) / ((a * d) - (b * c));
        DecimalFormat D = new DecimalFormat("0.00");
        if(((a * d) - (b * c)) == 0)
        {
            System.out.println("The two lines are parallel");
        }
        else
        {
            System.out.println("The intersecting point is at (" + D.format(xCoordinate) + "," + D.format(yOrdinate) + ")");
        }
    }
}
