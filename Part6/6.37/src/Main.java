import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        String number = input.next();
        System.out.println("Please enter the width: ");
        int width = input.nextInt();
        System.out.println(format(number , width));
    }
    public static String format(String number, int width)
    {
        if(width < number.length())
        {
            return number;
        }
        else
        {
            for(int i = 1; i <= width - number.length(); i++)
            {
                System.out.print("0");
            }
            System.out.print(number);
        }
        return "";
    }
}
