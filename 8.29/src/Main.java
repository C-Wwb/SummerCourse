import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        System.out.println("Please enter the array1: ");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                array1[i][j] = input.nextInt();
            }
        }
        System.out.println("Please enter the array2: ");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                array2[i][j] = input.nextInt();
            }
        }
        System.out.println(judge(array1, array2) ? "The two arrays are identical"
                : "The two arrays are not identical");
    }
    public static boolean judge(int[][] array1, int[][] array2)
    {
        int[] a1 = new int[9];
        int[] a2 = new int[9];
        int k = 0;
        int row = 0;
        int col = 0;
        while(k < 9 && row < 3)
        {
            a1[k] = array1[row][col];
            a2[k] = array2[row][col];
            k++;
            col++;
            if(col == 3)
            {
                col = 0;
                row++;
            }
        }
        int count = 0;
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(a1[i] == a2[j])
                {
                    count++;
                    break;
                }
            }
        }
        return count == 9;
    }
}
/*
text
51 22 25 6 1 4 24 54 6
51 25 22 6 1 4 24 54 6
 */