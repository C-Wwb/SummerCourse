import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Sudoku puzzle solution: ");
        int row = 9;
        int col = 9;
        int[][] sudokuSolution = new int[row][col];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                sudokuSolution[i][j] = input.nextInt();
            }
        }
        if(isValidCol(sudokuSolution) && isValidRow(sudokuSolution))
        {
            System.out.println("Valid solution");
        }
        else if(!isValidRow(sudokuSolution) || !isValidCol(sudokuSolution))
        {
            System.out.println("Invalid solution");
        }
    }
    public static boolean isValidRow (int[][] sudokuSolution)//判断每行是不是1-9
    {
        int total = 0;
        int col = 9;
        for(int i = 0; i < col; i++)
        {
            total += sudokuSolution[0][i];
            if(total == 45)
            {
                return true;
            }
        }
        return false;
    }
    public static boolean isValidCol (int[][] sudokuSolution)//判断每列是不是1-9
    {
        int total = 0;
        int row = 9;
        for(int i = 0; i < row; i++)
        {
            total += sudokuSolution[0][i];
            if(total == 45)
            {
                return true;
            }
        }
        return false;
    }
    public boolean isValidSquare (int[][] sudokuSolution)//判断每个小方块是不是1-9
    {
        int total = 0;
        int i = 0;
        while(i < 10)
        {
            i++;
        }
        return false;
    }
}
