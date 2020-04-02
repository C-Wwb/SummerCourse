import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int max = -1;
        int count = 0;
        int[] number = new int[100];
        System.out.println("Please enter numbers and end by 0:");
        for(int i = 1; i < 100; i++)
        {
            number[i] = input.nextInt();
            if(number[i] != 0)
            {
               if(number[i] > max)
               {
                   max = number[i];
                   count = 1;
               }
               else if(number[i] == max)
               {
                   count++;
               }
            }
            else
            {
                break;
            }
        }
        System.out.println("The largest number is: " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
