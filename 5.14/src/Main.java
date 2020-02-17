import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int min;
        int greatestCommonDivisor = -1;
        if(number1 < number2)
        {
            for(min = number1; min > 0; min--)
            {
                if(number1 % min == 0 && number2 % min == 0)
                {
                    greatestCommonDivisor = min;
                    break;
                }
            }
            System.out.println("The greatest common divisor of these two integers is: " + greatestCommonDivisor);
        }
    }
}
