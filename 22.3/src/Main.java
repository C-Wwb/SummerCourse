import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string s1: ");
        String s1 = input.nextLine();
        System.out.println("Please enter a string s2: ");
        String s2 = input.nextLine();
        System.out.println(findIndex(s1, s2));
    }
    public static int findIndex(String s1, String s2)
    {
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < s1.length())
        {
            if (s1.charAt(i) == s2.charAt(j))
            {
                if (j == 0)
                {
                    index = i;
                }
                i++;
                j++;
            }
            else
            {
                i += 1 - j;
                j = 0;
            }
            if (j == s2.length())
            {
                return index;

            }
        }
        return -1;
    }
}
/*
text
mississippi
sip

welcome to java
come
 */