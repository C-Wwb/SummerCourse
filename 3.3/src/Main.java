import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a , b , c , d , e , f: ");
        double  a = input.nextDouble(),
                b = input.nextDouble(),
                c = input.nextDouble(),
                d = input.nextDouble(),
                e = input.nextDouble(),
                f = input.nextDouble(),
                x = ((e * d) - (b * f)) / ((a * d) - (b * c)),
                y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        DecimalFormat D = new DecimalFormat("0.00");
        if(((a * d) - (b * c)) == 0)
        {
            System.out.println("The equation has no solution");
        }
        else
        {
            System.out.println("x is " + D.format(x) + " and y is " + D.format(y));
        }
    }
}
