import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string:");
        String string = input.next();
        char theFirstLetter = string.charAt(0);
        System.out.print("The length of the string is: " + string.length() +
                "\nThe first letter of string is: " + theFirstLetter);
    }
}
