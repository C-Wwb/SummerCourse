import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String string = input.next();
        int low = 0;
        int high = string.length() - 1;
        for(int i = 1; i < string.length() / 2; i++)
        {
            char left = string.charAt(low + i);
            char right = string.charAt(high - i);
            if(left == right)
            {
                System.out.println(string + " is a palindrome");
                break;
            }
            else
            {
                System.out.println(string + " is not a palindrome");
                break;
            }
        }


    }
}
