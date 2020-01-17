import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Please enter the time zone offset to GMT:");
        Scanner input = new Scanner(System.in);

        long TotalMilliSeconds = System.currentTimeMillis();
        long TotalSeconds = TotalMilliSeconds / 1000;
        long CurrentSeconds = TotalSeconds % 60;
        long TotalMinutes = TotalSeconds / 60;
        long CurrentMinutes = TotalMinutes % 60;
        long TotalHours = TotalMinutes / 60;
        long CurrentHours = TotalHours % 24;

        double  time = input.nextDouble();
        double current = CurrentHours + time;

        if(current > 24)
        {
            current -= 24;
        }
        else if(current < 0)
        {
            current += 24;
        }

        System.out.println("Current time is " + current + " : " + CurrentMinutes + " : " + CurrentSeconds + " GMT ");
    }
}
