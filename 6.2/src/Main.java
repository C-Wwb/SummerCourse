import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        long number = input.nextInt();
        sumDigits(number);
    }
    public static int sumDigits(long n)
    {
        int sum = 0;
        for(int i = 0; i < 100; i++)
        {
            sum  += n % 10;
            n /= 10;
            if(n == 0)
            {
                break;
            }
        }
        System.out.println("The sum of digit is: " + sum);
        return 0;
    }

}
