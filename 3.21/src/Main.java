import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year(e.g.,2020):");
        int year = input.nextInt();
        System.out.println("Please enter month:");
        int m = input.nextInt();
        System.out.println("Please enter the day of the month(1-31):");
        int q = input.nextInt(),
            j = year / 100,
            k = year % 100,
            h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        if(h == 0)
        {
            System.out.println("Day of the week is Saturday");
        }
        else if(h == 1)
        {
            System.out.println("Day of the week is Sunday");
        }
        else if(h == 2)
        {
            System.out.println("Day of the week is Monday");
        }
        else if(h == 3)
        {
            System.out.println("Day of the week is Tuesday");
        }
        else if(h == 4)
        {
            System.out.println("Day of the week is Wednesday");
        }
        else if(h == 5)
        {
            System.out.println("Day of the week is Thursday");
        }
        else if(h == 6)
        {
            System.out.println("Day of the week is Friday");
        }
    }
}
