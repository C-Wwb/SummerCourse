import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double DOddSum = 0;
        double DEvenSum = 0;
        int d;
        int count = 0;
        System.out.println("Please enter the first 12 digits of an ISBN-13 as a string: ");
        String IBSN = input.next();
        if(IBSN.length() != 12)
        {
            System.out.println(IBSN + " is an invalid input");
        }
        else
        {
            for(int i = 0; i < 12; i++)
            {
                char ch = IBSN.charAt(i);
                count++;
                if(count % 2 == 0)
                {
                    DEvenSum += 3 * (ch - 48);
                }
                else
                {
                    DOddSum += ch - 48;
                }
            }
            d = (int)(10 - (DEvenSum + DOddSum) % 10);
            if(d == 10)
            {
                System.out.println("The ISBN-13 number is " + IBSN + "0");
            }
            else
            {
                System.out.println("The ISBN-13 number is " + IBSN + d);
            }
        }
    }
}
