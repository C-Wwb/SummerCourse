import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of array: ");
        int number = input.nextInt();
        System.out.println("Please enter the array: ");
        double[] list = new double[number];
        for(int i = 0; i < list.length; i++)
        {
            list[i] = input.nextDouble();
        }
        System.out.println("The reverse list is: " + Arrays.toString(reverse(list)));
    }
    public static double[] reverse(double[] list)
    {
        double[] result = new double[list.length];
        for(int i = 0, j = list.length - 1; i < list.length; i++, j--)
        {
            result[i] = list[j];
        }
        return result;
    }
}
