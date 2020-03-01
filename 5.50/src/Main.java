import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String string = input.nextLine();
        int uppercase = 0;
        for(int i = 0; i < string.length(); i++)
        {
            char ch = string.charAt(i);
            if(ch >= 65 && ch <= 90)
            {
                uppercase++;
            }
        }
        System.out.println("The number of uppercase letters is: " + uppercase);
    }
}
