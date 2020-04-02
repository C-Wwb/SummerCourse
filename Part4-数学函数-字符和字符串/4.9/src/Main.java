import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a character:");
        String string = input.next();
        char character = string.charAt(0);
        int Unicode = (int)character;
        System.out.println("The Unicode for the character " + character + " is " + Unicode);
    }
}
