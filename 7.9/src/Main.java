import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = input.nextInt();
        System.out.println("Please enter array: ");
        double[] array = new double[number];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextDouble();
        }
        System.out.println("The min of the array is: " + min(array));
    }
    public static double min(double[] array)
    {
        double min = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }
}
