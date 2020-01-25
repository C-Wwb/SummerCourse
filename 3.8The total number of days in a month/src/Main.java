import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year:");
        int year = input.nextInt();
        System.out.println("Please enter the month:");
        int month = input.nextInt();
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            System.out.println(month + " month " + year + " year has 31 days");
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.println(month + " month " + year + " year has 30 days");
        }
        else if(month == 2)
        {
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0))
            {
                System.out.println(month + " month " + year + " year has 29 days");
            }
            else
            {
                System.out.println(month + " month " + year + " year has 28 days");
            }
        }
    }
}
