import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        double  a = input.nextDouble(),
                b = input.nextDouble(),
                c = input.nextDouble();
        compare(a,b);
        compare(a,c);
        compare(b,c);
        System.out.println("The order of these three Numbers: " + a + " < " + b + " < " + c);
    }
    static double compare(double a,double b)
    {
        double t;
        if(a > b)
        {
            t = a;
            a = b;
            b = t;
        }
        return 0;
    }
}
