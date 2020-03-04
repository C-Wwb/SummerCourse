import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        System.out.println("The maximum of " + number1 + " " + number2 + " " + number3 + " is "
                + Math.max((Math.max(number1 , number2)) , number3));
    }
}
