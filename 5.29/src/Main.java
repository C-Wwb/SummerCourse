import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year: ");
        int year = input.nextInt();
        System.out.println("What day of the week is the first day: ");
        int weekFirstDay = input.nextInt();
        int Month = 0;
        int day = 0;
        int space = 0;
        int count = 0;
        for(int i = 0; i < 12; i++)
        {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            {

                System.out.println( "\n" + transformMonth(Month) + year );
                System.out.println("-------------------------------------------");
                System.out.println("Mon   Tue   Wed   Thu   Fri   Sat   San");
                Month++;//打印完了1月,month等于几，就看几月的天数
                if(Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10)
                {
                    weekFirstDay = (31 - (8 - weekFirstDay)) % 7 + 1;
                    for(space = 0; space < 2 * weekFirstDay; space++)
                        System.out.print(" ");
                    for(day = 1; day <= 31; day++)
                    {
                        System.out.print(day + "    ");
                        count ++;
                        if(count % 7 == 5)
                        {
                            System.out.println();
                        }
                    }

                }
                else if(Month == 4 || Month == 6 || Month == 9 || Month == 11)
                {
                    weekFirstDay = (30 - (8 - weekFirstDay)) % 7 + 1;
                }
                else
                {
                    weekFirstDay = (29 - (8 - weekFirstDay)) % 7 + 1;
                }
            }
            else
            {
                System.out.println(transformMonth(Month) + year );
                System.out.println("-------------------------------------------");
                System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                Month++;//打印完了1月,month等于几，就看几月的天数
                if(Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10)
                {
                    weekFirstDay = (31 - (8 - weekFirstDay)) % 7 + 1;
                }
                else if(Month == 4 || Month == 6 || Month == 9 || Month == 11)
                {
                    weekFirstDay = (30 - (8 - weekFirstDay)) % 7 + 1;
                }
                else
                {
                    weekFirstDay = (28 - (8 - weekFirstDay)) % 7 + 1;
                }
            }
        }


    }
    public static String transformNum(int num)
    {
        if(num == 1)
        {
            return "Monday";
        }
        if(num == 2)
        {
            return "Tuesday";
        }
        if(num == 3)
        {
            return "Wednesday";
        }
        if(num == 4)
        {
            return "Thursday";
        }
        if(num == 5)
        {
            return "Friday";
        }
        if(num == 6)
        {
            return "Saturday";
        }
        if(num == 7)
        {
            return "Sunday";
        }
        return "";
    }
    public static String transformMonth(int month)
    {
        if(month == 1)
        {
            return "Jan ";
        }
        if(month == 2)
        {
            return "Feb ";
        }
        if(month == 3)
        {
            return "Mar ";
        }
        if(month == 4)
        {
            return "Apr ";
        }
        if(month == 5)
        {
            return "May ";
        }
        if(month == 6)
        {
            return "Jun ";
        }
        if(month == 7)
        {
            return "Jul ";
        }
        if(month == 8)
        {
            return "Aug ";
        }
        if(month == 9)
        {
            return "Sep ";
        }
        if(month == 10)
        {
            return "Oct ";
        }
        if(month == 11)
        {
            return "Nov ";
        }
        if(month == 12)
        {
            return "Dec ";
        }
        return "";
    }
}
