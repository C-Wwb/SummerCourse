import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three points for p0,p1, and p2:");
        double p0x = input.nextDouble(),
               p0y = input.nextDouble(),
               p1x = input.nextDouble(),
               p1y = input.nextDouble(),
               p2x = input.nextDouble(),
               p2y = input.nextDouble(),
               judge = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);
        /*if(judge > 0)
        {
            System.out.println("p2 is on the left side of the line");
        }
        else if(judge == 0)
        {
            System.out.println("p2 is on the same line");
        }
        else
        {
            System.out.println("p2 is on the right side of the line");
        }*/
        if((judge == 0) && (p2x > p0x) && (p2x < p1x))
        {
            System.out.println("(" + p2x + ", " + p2y + ") is on the line segment from (" + p0x + ", " + p0y + ") to "
            + "(" + p1x + ", " + p1y + ")");
        }
        else
        {
            System.out.println("(" + p2x + ", " + p2y + ") is not on the line segment from (" + p0x + ", " + p0y + ") to "
                + "(" + p1x + ", " + p1y + ")");
        }


    }
}
