import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String number = input.next();
        if(number.equalsIgnoreCase(revers(number)))
        {
            System.out.println("The number is a palindrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
        }

    }
    public static String revers(String n)
    {
        char ch;
        String reverseNumber = "";
        for(int i = n.length() - 1; i >= 0; i--)
        {
            ch = n.charAt(i);
            reverseNumber += ch;
        }
        return reverseNumber;
    }
}
