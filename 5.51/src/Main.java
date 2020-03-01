import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String string1 = input.nextLine();
        System.out.println("Please enter the second string: ");
        String string2 = input.nextLine();
        char ch1 = 0;
        char ch2 = 0;
        if(string1.charAt(0) != string2.charAt(0))
        {
            System.out.println(string1 + " and " + string2 + " have no common prefix");
        }
        else
        {
            System.out.println("The common prefix is: ");
                for(int i = 0; i < 100; i++)
                {
                    ch1 = string1.charAt(i);
                    ch2 = string2.charAt(i);
                    if(ch1 == ch2)
                    {
                        System.out.print(ch1);
                    }
                    else
                    {
                        break;
                    }
                }
        }
    }
}
