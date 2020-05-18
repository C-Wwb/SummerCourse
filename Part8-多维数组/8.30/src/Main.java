import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a: ");
        double[][] a = new double[2][2];
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                a[i][j] = input.nextDouble();
            }
        }
        System.out.println("Please enter b: ");
        double[] b = new double[2];
        for(int i = 0; i < 2; i++)
        {
            b[i] = input.nextDouble();
        }
        if((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]) == 0)
        {
            System.out.println("null");
        }
        else
        {
            System.out.println(Arrays.toString(linerEquation(a, b)));
        }
    }
    public static double[] linerEquation(double[][] a, double[] b)
    {
        double[] result = new double[2];
        result[0] = ((b[0] * a[1][1]) - (b[1] * a[0][1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
        result[1] = ((b[1] * a[0][0]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
        return result;
    }
}
/*
text
a: 9 4 3 -5
b: -6 -21
 */