import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 3-by-4 matrix row by row: ");
        double[][] array = new double[3][4];
        double sum = 0;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                array[i][j] = input.nextDouble();
            }
        }
        for(int i = 0; i < 4; i++)
        {
            sum = 0;
            for(int j = 0; j < 3; j++)
            {
                sum += array[j][i];
            }
            System.out.println("Sum of the elements at column " + i + " is " + sum);
        }
    }
}
