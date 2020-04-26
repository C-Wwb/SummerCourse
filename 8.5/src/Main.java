import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter matrix1: ");
        double[][] matrix1 = new double[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.println("Please enter matrix2: ");
        double[][] matrix2 = new double[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                matrix2[i][j] = input.nextDouble();
            }
        }
        System.out.println("The matrices are added as follows \n"
                + Arrays.deepToString(matrix1) + " + " + Arrays.deepToString(matrix2)
                + " = " + Arrays.deepToString(addMatrix(matrix1, matrix2)));
    }
    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2)
    {
        double[][] addition = new double[3][3];
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return addition;
    }
}
/*
text matrix1: 1 2 3 4 5 6 7 8 9
     matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
 */
