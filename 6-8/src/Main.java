import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a digit number: ");
        int digit = input.nextInt();
        System.out.println("The decimal value for hex number " + digit + " is "
                + Integer.toHexString(digit).toUpperCase());
    }
}
