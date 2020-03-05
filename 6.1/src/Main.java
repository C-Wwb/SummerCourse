import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        getPentagonalNumber(number);
    }
    public static int getPentagonalNumber(int n)
    {
        int pentagonalNumber = 0;
        int count = 0;
        for(int i = 1; i <= n; i++)
        {
            pentagonalNumber = i * (3 * i - 1) / 2;
            System.out.print(pentagonalNumber + " ");
            count++;
            pentagonalNumber = 0;
            if(count % 10 == 0)
            {
                System.out.println();
            }
        }
        return 0;
    }
}
