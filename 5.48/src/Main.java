import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = input.nextLine();
        for(int i = 0; i < string.length(); i++)
        {
            char ch = string.charAt(i);
            if(i % 2 == 0)
            {
                System.out.print(ch);
            }
        }
    }
}
