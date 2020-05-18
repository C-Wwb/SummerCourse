import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 4-by-4 matrix row by row: ");
        double[][] array = new double[4][4];
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                array[i][j] = input.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is: " + diagonal(array));
    }
    public static double diagonal(double[][] array)
    {
        double sum = 0;
        for(int i = 0; i < 4; i++)
        {
            sum += array[i][i];
        }
        return sum;
    }
}
