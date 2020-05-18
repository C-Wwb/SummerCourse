import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 511: ");
        int number = input.nextInt();
        coin(number);
    }
    public static void coin(int number)
    {
        int[] coin = new int[9];
        int count = 0;
        String[] totalSituation = new String[512];
        Arrays.fill(totalSituation, "");
        while (count < 511)
        {
            for(int i = 0; i < coin.length; i++)
            {
                coin[i] = (int)(Math.random() * 2);
            }
            totalSituation[count] += Arrays.toString(coin);
            count++;
        }
        System.out.println(totalSituation[number]);
    }
}
