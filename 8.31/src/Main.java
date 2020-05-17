import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter x1,y1,x2,y2,x3,y3,x4,y4:");
        double[][] l1 = new double[2][2];
        double[][] l2 = new double[2][2];
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                l1[i][j] = input.nextDouble();
            }
        }
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                l2[i][j] = input.nextDouble();
            }
        }
        double  x1 = l1[0][0],
                y1 = l1[0][1],
                x2 = l1[1][0],
                y2 = l1[1][1],
                x3 = l2[0][0],
                y3 = l2[0][1],
                x4 = l2[1][0],
                y4 = l2[1][1],
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
