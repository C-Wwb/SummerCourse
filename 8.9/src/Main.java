import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] wellGame = new String[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                wellGame[i][j] = " ";
            }
        }
        while (judge(wellGame))
        {
            System.out.println("Please enter a row (0, 1, 2) for player X: ");
            int row = input.nextInt();
            System.out.println("Please enter a column (0, 1, 2) for player X: ");
            int column = input.nextInt();
            wellGame[row][column] = "X";
        }
    }
    public static boolean judge(String[][] wellGame)
    {
        int countX = 0;
        int countO = 0;
        for(int i = 0; i < 3; i++)//满盘
        {
            for(int j = 0; j < 3; j++)
            {
                if(wellGame[i][j].equals("X"))
                {
                    countX++;
                }
                if(wellGame[i][j].equals("O"))
                {
                    countO++;
                }
            }
        }
        if(countO == 3 && countX == 3)
        {
            return false;
        }
        for(int i = 0; i < 2; i++)
        {
            if(wellGame[i][i].equals(wellGame[i + 1][i + 1]) //对角线
                    || wellGame[i][2 - i].equals(wellGame[i + 1][2 - (i + 1)]))
            {
                return false;
            }
            if(wellGame[i][0].equals(wellGame[i + 1][0]) || wellGame[i][1].equals(wellGame[i + 1][1])
            || wellGame[i][2].equals(wellGame[i + 1][2]))//行
            {
                return false;
            }
            if(wellGame[0][i].equals(wellGame[0][i + 1]) || wellGame[1][i].equals(wellGame[1][i + 1])
                    || wellGame[2][i].equals(wellGame[2][i + 1]))//竖
            {
                return false;
            }
        }
        return true;
    }
}
