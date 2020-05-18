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
        judge(matrix, size);
    }
    public static void judge(int[][] matrix, int size)
    {
        int count = 0;//每一行的单个元素相同统计
        int totalCount = 0;//统计该矩阵是否有相同行
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size - 1; j++)
            {
                if(matrix[i][j] == matrix[i][j + 1])
                {
                    count++;
                }
            }
            if(count < size - 1)
            {
                totalCount++;
            }
            if(count == size - 1)
            {
                if(matrix[i][0] == 0)
                {
                    System.out.println("All 0s numbers on row " + i);
                }
                if(matrix[i][0] == 1)
                {
                    System.out.println("All 1s numbers on row " + i);
                }
            }
        }
        if(totalCount == 4)
        {
            System.out.println("No same numbers on a row");
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