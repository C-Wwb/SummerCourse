import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 6-by-6 matrix row by row: ");
        int[][] array = new int[6][6];
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.toString(judge(array)));
    }
    public static int[] judge(int[][] array)
    {
        int count = 0;
        int resultRow = 0;
        int resultCol = 0;
        int[] result = new int[6];
        for(int i = 0; i < 6; i++)
        {
            count = 0;
            Arrays.fill(result, 0);
            for(int j = 0; j < 6; j++)
            {
                result[j] = array[i][j];
                if(array[i][j] == 1)
                {
                    count++;
                }
            }
            if(count % 2 != 0)
            {
                resultRow = i;
                break;
            }
        }
        for(int i = 0; i < 6; i++)
        {
            if(result[i] == 1)
            {
                resultCol = i;
                break;
            }
        }
        return new int[]{resultRow, resultCol};
    }
}
/*
text
1 1 1 0 1 1
1 1 1 1 0 0
0 1 0 1 1 1
1 1 1 1 1 1
0 1 1 1 1 0
1 0 0 0 0 1
 */