import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = input.nextInt();
        double[] array = new double[number];
        System.out.println("Please enter the array: ");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextDouble();
        }
        System.out.println("The mean is " + String.format("%.2f" , mean(array)));
        System.out.println("The standard deviation is " + String.format("%.2f" , deviation(array)));
    }
    public static double deviation(double[] x)
    {
        double standardDeviation = 0;
        for(int i = 0; i < 10; i++)
        {
            standardDeviation += Math.pow((x[i] - mean(x)) , 2);
        }
        return Math.sqrt(standardDeviation / 9);
    }
    public static double mean(double[] x)
    {
        double sum = 0;
        for (double v : x) {
            sum += v;
        }
        return sum / x.length;
    }
}
