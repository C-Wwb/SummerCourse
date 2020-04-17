import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        double[] array = new double[size];
        System.out.println("Please enter the array: ");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextDouble();
        }
        System.out.println("The sum is: " + sum(array));
    }
    public static double sum(double[] array)
    {
        double sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        return sum;
    }
}
