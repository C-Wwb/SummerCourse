import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array: ");
        int[][] array = new int[4][4];
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4 ; j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        judge(array);
    }
    public static void judge(int[][] array)
    {
        int i = 0;
        int[] countRow = new int[4];
        int[] countCol = new int[4];
        while(i < 4)
        {
            for(int j = 0; j < 4; j++)
            {
                if(array[i][j] == 1)
                {
                    countRow[i]++;
                }
                if(array[j][i] == 1)
                {
                    countCol[i]++;
                }
            }
            i++;
        }
        int indexRow = 0;
        int indexCol = 0;
        int maxRow = countRow[0];
        int maxCol = countCol[0];
        for(i = 0; i < 4; i++)
        {
            if(maxRow < countRow[i])
            {
                maxRow = countRow[i];
                indexRow = i;
            }
            if(maxCol < countCol[i])
            {
                maxCol = countCol[i];
                indexCol = i;
            }
        }
        System.out.println("The largest row index: " + indexRow);
        System.out.println("The largest column index: " + indexCol);
    }
}
