import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] trueNumbers = new int[10];

        System.out.print("Enter ten numbers: ");
        int count = 0;

        for(int i = 1; i < 10; i++)
        {
            int key = input.nextInt();
            int j;
            for(j = 0; j < count; j++)
            {
                if(key == trueNumbers[j])
                {
                    break;
                }
            }
            if(j == count)
            {
                trueNumbers[count] = key;
                count++;
            }
        }
        System.out.print("The distinct numbers are: ");
        for(int i = 0; i < count; i++){
            System.out.print(trueNumbers[i]+" ");
        }
    }

}