import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of balls to drop: ");//有几个球落
        int numberOfBalls = input.nextInt();
        System.out.println("Please enter the number of slots in the bean machine: ");//有几个盒子
        int size = input.nextInt();
        int[] slots = new int[size];//盒子的一维数组
        int plies = 7;
        for(int i = 0; i < numberOfBalls; i++)
        {
            System.out.println(path(i));
            numberOfBallsInTheBox(slots, plies, path(i));
        }
        System.out.println(Arrays.toString(slots));
    }
    public static String path(int ballNumber)//球的7次路径
    {
        StringBuilder ballPath = new StringBuilder();
        int plies = 7;
        for(int i = 0; i < plies; i++)
        {
            ballPath.append(option(plies));
        }
        return "" + ballPath;
    }
    public static String option(int plies)//每次球的选择
    {
        for(int i = 0; i < plies; i++)
        {
            int option = (int)(Math.random() * 2);
            if(option == 0)
            {
                return "L";
            }
            else if(option == 1)
            {
                return "R";
            }
        }
        return "";
    }
    public static void numberOfBallsInTheBox(int[] slots, int plies, String path)
    {//每个盒子的进球规则,循环调用7次
        int countR = 0;
        for (int j = 0; j < plies; j++)//遍历这个path，统计共有几个r
        {
            char ch = path.charAt(j);
            if (ch == 82)
            {
                countR++;
            }
        }
        slots[countR]++;
    }
}
