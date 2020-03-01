import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int integer = -1;
        int sum = 0;
        while(integer != 0)
        {
            System.out.println("Please enter an integer (the input ends if it is 0):");
            integer = input.nextInt();
            sum += integer;
        }
        System.out.println("The sum is " + sum);
    }
}
