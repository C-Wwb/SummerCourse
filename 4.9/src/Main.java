import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a character:");
        char character = input.next();
        int Unicode = (int)'character';
    }
}
