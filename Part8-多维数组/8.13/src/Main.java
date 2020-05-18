import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the row of the array: ");
        int row = input.nextInt();
        System.out.println("Please enter the col of the array: ");
        int col = input.nextInt();
        double[][] array = new double[row][col];
        System.out.println("Please enter the array: ");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                array[i][j] = input.nextDouble();
            }
        }
        System.out.println("The locate of largest element is at " + Arrays.toString(locateLargest(array, row, col)));
    }
    public static int[] locateLargest(double[][] array, int row, int col)
    {
        double max = array[0][0];
        int[] maxRowCol = new int[2];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(max < array[i][j])
                {
                    max = array[i][j];
                    maxRowCol[0] = i;
                    maxRowCol[1] = j;
                }
            }
        }
        return maxRowCol;
    }
}
/*
text
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
 */
