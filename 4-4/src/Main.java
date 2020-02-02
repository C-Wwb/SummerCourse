import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a hex digit:");
        String hexDigit = input.nextLine();
        if(hexDigit.length() != 1)
        {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        else
        {
            char letters = Character.toUpperCase(hexDigit.charAt(0));//把输入的数字以大写的形式保存到字符中
            if(letters >= 'A' && letters <= 'F')
            {
                int value = letters - 'A' + 10;
                System.out.println("The decimal value for hex digit " + letters + " is " + value);
            }
            else if(Character.isDigit(letters))

            {
                System.out.println("The decimal value for hex digit " + letters + " is " + letters);
            }
            else
            {
                System.out.println(letters + " is an invalid input");
            }
        }

    }
}
/*
String s = "W";
char c = 'W';
System.out.println(s + " " + c);
**/