import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        displayPattern(number);

    }
    public static void displayPattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int space = n - i; space > 0; space--)
                System.out.print(" ");
            for(int num = i; num >= 1; num--)
            {
                System.out.print(num);
                if(num == 1)
                {
                    System.out.println();
                }
            }

        }
    }
}
