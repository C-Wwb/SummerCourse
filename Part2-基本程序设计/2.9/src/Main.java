import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter v0¡¢v1 and t:");
        double  v0 = input.nextDouble(),
                v1 = input.nextDouble(),
                t = input.nextDouble(),
        a = (v1 - v0) / t;
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The average acceleration is " + d.format(a));
    }
}
