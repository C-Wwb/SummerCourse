import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[][] grid = readSolution();
        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }

    public static boolean isValid(int[][] grid)
    {
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++)
                if(grid[i][j] < 1 || grid[i][j] > 9 || isValid(i, j, grid))
                    return false;
            return true;
    }
    public static boolean isValid(int i, int j, int[][] grid)
    {
        for(int col = 0; col < 9; col++)
            if (col != j && grid[i][col] == grid[i][j])
                return false;

        for(int row = 0; row < 9; row++)
            if (row != j && grid[i][row] == grid[i][j])
                return false;

        for(int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
            for(int col = (i / 3) * 3; col < (i / 3) * 3 + 3; col++)
            if (!(row == i && col == j) && grid[row][col] == grid[i][j])
                return false;

        return true;
    }

    private static int[][] readSolution()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Sudoku puzzle solution: ");
        int[][] grid = new int[9][9];
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();
        return grid;
    }
    /*
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
    }*/
}
