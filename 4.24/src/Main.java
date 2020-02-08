import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first city:");
        String city1 = input.next();
        System.out.println("Please enter the second city:");
        String city2 = input.next();
        System.out.println("Please enter the third city:");
        String city3 = input.next();
        if(city1.compareToIgnoreCase(city2) < 0)
        {
            if(city3.compareToIgnoreCase(city1) < 0)
            {
                System.out.println("The three cities in alphabetical order are "
                        + city3 + " " + city1 + " " + city2);
            }
            else if(city1.compareToIgnoreCase(city3) < 0 && city3.compareToIgnoreCase(city2) < 0)
            {
                System.out.println("The three cities in alphabetical order are "
                        + city1 + " " + city3 + " " + city2);
            }
            else
            {
                System.out.println("The three cities in alphabetical order are "
                        + city1 + " " + city2 + " " + city3);
            }
        }
        else if(city2.compareToIgnoreCase(city1) < 0)
        {
            if(city3.compareToIgnoreCase(city2) < 0)
            {
                System.out.println("The three cities in alphabetical order are "
                        + city3 + " " + city2 + " " + city1);
            }
            else if(city2.compareToIgnoreCase(city3) < 0 && city3.compareToIgnoreCase(city1) < 0)
            {
                System.out.println("The three cities in alphabetical order are "
                        + city2 + " " + city3 + " " + city1);
            }
            else
            {
                System.out.println("The three cities in alphabetical order are "
                        + city2 + " " + city1 + " " + city3);
            }
        }

    }

}
