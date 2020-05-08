import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] chess = new String[6][7];
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                chess[i][j] = "";
            }
        }
    }
    public static String[][] drop(String[][] chess)//下棋
    {

    }
    public static boolean isWin(String[][] chess, int i, int j)//判断输赢
    {
        int num0=0;
        int num1=0;
        int num2=0;
        int num3=0;
        for(int l = 0; l < 3; l++){
            //正对角线
            if(i == j){
                if(chess[l][l].equalsIgnoreCase("R")
                        || chess[l][l].equalsIgnoreCase("Y")){
                    num0 += 1;
                }}
            //反对角线
            if(i == 2 - j){
                if(chess[l][2 - l].equalsIgnoreCase("R")
                        || chess[l][2 - l].equalsIgnoreCase("Y")){
                    num1 += 1;
                }}
            //行
            if(chess[i][l].equalsIgnoreCase("R")
                    || chess[i][l].equalsIgnoreCase("Y")){
                num2 += 1;
            }
            //列
            if(chess[l][j].equalsIgnoreCase("R")
                    || chess[l][j].equalsIgnoreCase("Y")){
                num3 += 1;
            }
        }

        if(num0 == 4 || num1 == 4 || num2 == 4 || num3 == 4){
            return true;
        }
        else
            return false;
    }
}
