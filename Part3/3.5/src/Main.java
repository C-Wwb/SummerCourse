import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter today`s day(0 - 6):");
        int today = input.nextInt();
        System.out.println("Please enter number of days elapsed since today:");
        int elapsedSinceToday = input.nextInt();
        int lastDate = elapsedSinceToday + today;
        System.out.print(disweek(today) + disFutureWeek(lastDate));
    }

    static int disweek(int a)
    {
        if (a == 0) {
            System.out.print("Today is Sunday ");
        }
        else if (a == 1) {
            System.out.print("Today is Monday ");
        }
        else if (a == 2) {
            System.out.print("Today is Tuesday ");
        }
        else if (a == 3) {
            System.out.print("Today is Wednesday ");
        }
        else if (a == 4) {
            System.out.print("Today is Thursday ");
        }
        else if (a == 5) {
            System.out.print("Today is Friday ");
        }
        else if (a == 6) {
            System.out.print("Today is Saturday ");
        }
        return 0;
    }

    static int disFutureWeek(int b) {
        if (b % 7 == 0) {
            System.out.println("the future day is Sunday");
        }
        else if (b % 7 == 1) {
            System.out.println("the future day is Monday");
        }
        else if (b % 7 == 2) {
            System.out.println("the future day is Tuesday");
        }
        else if (b % 7 == 3) {
            System.out.println("the future day is Wednesday");
        }
        else if (b % 7 == 4) {
            System.out.println("the future day is Thursday");
        }
        else if (b % 7 == 5) {
            System.out.println("the future day is Friday");
        }
        else if (b % 7 == 6) {
            System.out.println("the future day is Saturday");
        }
        return 0;
    }

}