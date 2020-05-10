import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[][] array = new int[6][6];
        System.out.println(Arrays.deepToString(fill(array)));
        System.out.println(judgeCol(fill(array)) && judgeRow(fill(array)) ? "true" : "false");
    }
    public static int[][] fill(int[][] array)
    {
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                array[i][j] = (int)(Math.random() * 2);
            }
        }
        return array;
    }
    public static boolean judgeRow(int[][] array)
    {
        int count = 0;
        for(int i = 0; i < 6; i++)
        {
            int countRow = 0;
            for(int j = 0; j < 6; j++)
            {
                if(array[i][j] == 1)
                {
                    countRow++;
                }
            }
            if(countRow % 2 == 0)
            {
                count++;
            }
        }
        return count == 6;
    }
    public static boolean judgeCol(int[][] array)
    {
        int count = 0;
        for(int i = 0; i < 6; i++)
        {
            int countCol = 0;
            for(int j = 0; j < 6; j++)
            {
                if(array[j][i] == 1)
                {
                    countCol++;
                }
            }
            if(countCol % 2 == 0)
            {
                count++;
            }
        }
        return count == 6;
    }
}
