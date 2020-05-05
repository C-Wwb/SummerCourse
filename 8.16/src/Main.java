import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter row of array: ");
        int row = input.nextInt();
        System.out.println("Please enter col of array: ");
        int col = input.nextInt();
        System.out.println("Please enter the array: ");
        int[][] array = new int[row][col];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        sort(array, row, col);
    }
    public static void sort(int[][] array, int row, int col)
    {
        int tempRow;
        int tempCol;
        for(int i = 0; i < row - 1; i++)
        {
            for(int j = 0; j < col - 1; j++)
            {
                if(array[i][j] > array[i + 1][j])
                {
                    tempRow = array[i][j];
                    array[i][j] = array[i + 1][j];
                    array[i + 1][j] = tempRow;
                }
            }
        }
        for(int i = 0; i < row - 1; i++)
        {
            for(int j = 0; j < col - 1; j++)
            {
                if(array[i][j] > array[i][j + 1])
                {
                    tempCol = array[i][j];
                    array[i][j] = array[i][j + 1];
                    array[i][j + 1] = tempCol;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
/*
text
4 2
1 7
4 5
1 2
1 1
4 1
 */
