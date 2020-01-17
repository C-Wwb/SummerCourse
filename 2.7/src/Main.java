import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of minutes:");
        double  minutes = input.nextDouble(),
                totalDays = (int)minutes / 1440,
                years = (int)totalDays / 365,
                days = (int)totalDays - years * 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}
