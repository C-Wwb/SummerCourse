import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter:");
        String letter = input.next();
        if(letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("B")
        || letter.equalsIgnoreCase("C"))
        {
            System.out.println("The corresponding number is 2");
        }
        else if(letter.equalsIgnoreCase("D") || letter.equalsIgnoreCase("E")
                || letter.equalsIgnoreCase("F"))
        {
            System.out.println("The corresponding number is 3");
        }
        else if(letter.equalsIgnoreCase("G") || letter.equalsIgnoreCase("H")
                || letter.equalsIgnoreCase("I"))
        {
            System.out.println("The corresponding number is 4");
        }
        else if(letter.equalsIgnoreCase("J") || letter.equalsIgnoreCase("K")
                || letter.equalsIgnoreCase("L"))
        {
            System.out.println("The corresponding number is 5");
        }
        else if(letter.equalsIgnoreCase("M") || letter.equalsIgnoreCase("N")
                || letter.equalsIgnoreCase("O"))
        {
            System.out.println("The corresponding number is 6");
        }
        else if(letter.equalsIgnoreCase("P") || letter.equalsIgnoreCase("Q")
                || letter.equalsIgnoreCase("R") || letter.equalsIgnoreCase("S"))
        {
            System.out.println("The corresponding number is 7");
        }
        else if(letter.equalsIgnoreCase("T") || letter.equalsIgnoreCase("U")
        || letter.equalsIgnoreCase("V"))
        {
            System.out.println("The corresponding number is 8");
        }
        else if(letter.equalsIgnoreCase("W") || letter.equalsIgnoreCase("X")
        || letter.equalsIgnoreCase("Y") || letter.equalsIgnoreCase("Z"))
        {
            System.out.println("The corresponding number is 9");
        }
        else
        {
            System.out.println(letter + " is an invalid input");
        }
    }
}
