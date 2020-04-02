import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year:");
        int year = input.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
            System.out.println("Please enter a month:");
            String month = input.next();
            if(month.equals("Jan") || month.equals("Mar")
            || month.equals("May") || month.equals("Jul")
            || month.equals("Aug") || month.equals("Oct")
            || month.equals("Dec"))
            {
                System.out.println(month + " " + year + " has 31 days");
            }
            else if(month.equals("Apr") || month.equals("Jun")
            || month.equals("Sep") || month.equals("Nov"))
            {
                System.out.println(month + " " + year + " has 30 days");
            }
            else if(month.equals("Feb"))
            {
                System.out.println(month + " " + year + " has 29 days");
            }
            else
            {
                System.out.println(month + " is not a correct month name");
            }
        }
        else
        {
            System.out.println("Please enter a month:");
            String month = input.next();
            if(month.equals("Jan") || month.equals("Mar")
                    || month.equals("May") || month.equals("Jul")
                    || month.equals("Aug") || month.equals("Oct")
                    || month.equals("Dec"))
            {
                System.out.println(month + " " + year + " has 31 days");
            }
            else if(month.equals("Apr") || month.equals("Jun")
                    || month.equals("Sep") || month.equals("Nov"))
            {
                System.out.println(month + " " + year + " has 30 days");
            }
            else if(month.equals("Feb"))
            {
                System.out.println(month + " " + year + " has 28 days");
            }
            else
            {
                System.out.println(month + " is not a correct month name");
            }
        }


    }
}
//Jan31 Feb2829 Mar31 Apr30 May31 Jun30 Jul31 Aug31 Sep30 Oct31 Nov30 Dec31