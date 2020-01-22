import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("Please enter a , b , c to Solve the quadratic equation of one variable:");
        double  a = input.nextDouble(),
                b = input.nextDouble(),
                c = input.nextDouble(),
                t = Math.sqrt(Math.pow(b , 2) - 4 * a * c),
                root1 = (-b + t) / 2 * a,
                root2 = (-b - t) / 2 * a;
        if(t > 0)
        {
            System.out.println("The equation has two roots " + d.format(root1) + " and " + d.format(root2));
        }
        else if(t == 0)
        {
            System.out.println("The equation has one root " + d.format(root1));
        }
        else
        {
            System.out.println("The equation has no real roots");
        }

    }
}
