import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        double[][] array = new double[size][size];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        System.out.println("The sum is: " + sum(array));
    }
    public static double sum(double[][] array)
    {
        double sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
