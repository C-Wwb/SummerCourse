import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year = input.nextInt();
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon",
                "snake", "horse", "sheep"};
        switch (year % 12)
        {
            case 0: System.out.println(zodiac[0]); break;
            case 1: System.out.println(zodiac[1]); break;
            case 2: System.out.println(zodiac[2]); break;
            case 3: System.out.println(zodiac[3]); break;
            case 4: System.out.println(zodiac[4]); break;
            case 5: System.out.println(zodiac[5]); break;
            case 6: System.out.println(zodiac[6]); break;
            case 7: System.out.println(zodiac[7]); break;
            case 8: System.out.println(zodiac[8]); break;
            case 9: System.out.println(zodiac[9]); break;
            case 10: System.out.println(zodiac[10]); break;
            case 11: System.out.println(zodiac[11]); break;
        }
    }
}
