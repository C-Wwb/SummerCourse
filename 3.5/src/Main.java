import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter today`s day(0 - 6):");
        int today = input.nextInt();
        System.out.println("Please enter number of days elapsed since today:");
        int  elapsedSinceToday = input.nextInt();
        Today t = new Today(today);
        futureDay fd = new futureDay();
        System.out.println("and");
    }
}
class Today
{
    int today;
    Today(int today)
    {

    }

    public Today() {

    }

    public void disweek()
    {
        if(today == 0)
        {
            System.out.println("Today is Sunday ");
        }
        if(today == 1)
        {
            System.out.println("Today is Monday ");
        }
        if(today == 2)
        {
            System.out.println("Today is Tuesday ");
        }
        if(today == 3)
        {
            System.out.println("Today is Wednesday ");
        }
        if(today == 4)
        {
            System.out.println("Today is Thursday ");
        }
        if(today == 5)
        {
            System.out.println("Today is Friday ");
        }
        if(today == 6)
        {
            System.out.println("Today is Saturday ");
        }
    }
}
class futureDay extends Today
{
    int elapsedSinceToday;
    int lastDate = elapsedSinceToday + today;
    futureDay()
    {
        super();
    }
    public void disFutureWeek()
    {
        if(lastDate % 7 == 0)
        {
            System.out.println("the future day is Sunday");
        }
        if(lastDate % 7 == 1)
        {
            System.out.println("the future day is Monday");
        }
        if(lastDate % 7 == 2)
        {
            System.out.println("the future day is Tuesday");
        }
        if(lastDate % 7 == 3)
        {
            System.out.println("the future day is Wednesday");
        }
        if(lastDate % 7 == 4)
        {
            System.out.println("the future day is Thursday");
        }
        if(lastDate % 7 == 5)
        {
            System.out.println("the future day is Friday");
        }
        if(lastDate % 7 == 6)
        {
            System.out.println("the future day is Saturday");
        }
    }
}
