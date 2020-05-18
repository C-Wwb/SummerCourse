import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 3-by-3 matrix row by row: ");
        double[][] array = new double[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                array[i][j] = input.nextDouble();
            }
        }
        System.out.println((judge(array) ? "It is a Markov matrix" : "It is not a Markov matrix"));
    }
    public static boolean judge(double[][] array)
    {
        double countCol = 0;
        int count = 0;
        int col = 0;
        while(col < 3)
        {
            for(int i = 0; i < 3; i++)
            {
                if(array[i][col] < 0)
                {
                    return false;
                }
                countCol += array[i][col];
            }
            if(countCol == 1)
            {
                count++;
            }
            countCol = 0;
            col++;
        }
        return count == 3;
    }
}
/*
text
0.15 0.875 0.375
0.55 0.005 0.225
0.30 0.12 0.4

0.15 -0.875 0.375
0.55 0.005 0.225
0.30 0.12 0.4
 */