import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter point`s x- and y-coordinates:");
        double x = input.nextDouble(),
               y = input.nextDouble(),
               k = (y - 100) / x;
        if((x < 200) && (x > 0) && (y > 0) && (y < 100) && (k < -0.5))
        {
            System.out.println("The point is in the triangle");
        }
        else
        {
            System.out.println("The point is not in the triangle");
        }
    }
}
