import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an ASCII code from 0 to 127:");
        int ASCIICode = input.nextInt();
        char character = (char)ASCIICode;
        System.out.println("The character for ASCII code " + ASCIICode + " is " + character);

    }
}
