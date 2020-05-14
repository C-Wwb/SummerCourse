import java.util.Arrays;
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
        System.out.println(judge(array1, array2) ? "The two arrays are strictly identical"
                : "The two arrays are not strictly identical");
    }
    public static boolean judge(int[][] array1, int[][] array2)
    {
        return Arrays.deepEquals(array1, array2);
    }
}
/*
text
51 22 25 6 1 4 24 54 6
51 22 25 6 1 4 24 54 7
 */