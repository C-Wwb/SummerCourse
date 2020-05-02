import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("The matrix is: ");
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        isRow(matrix);
        isCol(matrix);
    }
    public static void isRow(int[][] matrix)
    {
        int row = 0;
        while(row < 4)
        {
            if(matrix[row][0] == matrix[row][1]
                    && matrix[row][0] == matrix[row][2]
                    && matrix[row][0] == matrix[row][3])
            {
                if(matrix[row][0] == 0)
                {
                    System.out.println("All 0s on row " + row);
                }
                else if(matrix[row][0] == 1)
                {
                    System.out.println("All 1s on row " + row);
                }
                else
                {
                    System.out.println("No same numbers on a row");
                }
            }
            row++;
        }
    }
    public static void isCol(int[][] matrix)
    {
        int col = 0;
        while(col < 4)
        {
            if(matrix[0][col] == matrix[1][col]
                    && matrix[0][col] == matrix[2][col]
                    && matrix[0][col] == matrix[3][col])
            {
                if(matrix[0][col] == 0)
                {
                    System.out.println("All 0s on col " + col);
                }
                else if(matrix[0][col] == 1)
                {
                    System.out.println("All 1s on col " + col);
                }
                else
                {
                    System.out.println("No same numbers on a col");
                }
            }
            col++;
        }
    }
}
/*
test
0 1 1 1
0 0 0 0
0 1 0 0
1 1 1 1
 */