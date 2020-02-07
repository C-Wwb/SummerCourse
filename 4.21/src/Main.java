import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a SSN:");
        String SSN = input.next();
        char symbol1 = SSN.charAt(3),
             symbol2 = SSN.charAt(6);
        if((SSN.length() == 11) && (symbol1 == '-') && (symbol2 == '-'))
        {
            System.out.print(SSN + " is a valid social security number");
        }
        else
        {
            System.out.print(SSN + " is an invalid social security number");
        }
    }
}
