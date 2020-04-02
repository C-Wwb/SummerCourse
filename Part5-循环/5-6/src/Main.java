import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int integer = -1;
        do{
            System.out.println("Please enter an integer(the input ends if it is 0):");
            integer = input.nextInt();
            sum += integer;
        }while(integer != 0);
        System.out.println("The sum is: " + sum);
    }
}
