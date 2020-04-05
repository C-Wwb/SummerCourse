import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String st = input.next();
        System.out.println("The number of uppercase is: " + countUppercaseLetter(st));
    }
    public static int countUppercaseLetter(String st)
    {
        int count = 0;
        for(int i = 0; i < st.length() - 1; i++)
        {
            char ch = st.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                count++;
            }
        }
        return count;
    }


}
