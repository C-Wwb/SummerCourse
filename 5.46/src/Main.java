import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String string = input.next();
        for(int i = 1; i <= string.length(); i++)
        {
            char ch = string.charAt(string.length() - i);
            System.out.print(ch);
        }
    }
}
