import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String string = input.next();
        System.out.println("The string after sort is: " + sort(string));
    }
    public static String sort(String s)
    {
        int[] value = new int[s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            value[i] = (int)(s.charAt(i));
        }
        java.util.Arrays.sort(value);
        StringBuilder string = new StringBuilder(" ");
        for(int i = 0; i < s.length(); i++)
        {
            string.append((char) (value[i]));
        }
        return string.toString();
    }
}
