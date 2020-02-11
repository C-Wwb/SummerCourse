import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first integer");
        int firstInteger = input.nextInt();
        System.out.println("Please enter second integer");
        int secondInteger = input.nextInt();
        long startTime = System.currentTimeMillis();
        int gcd = 1;
        for(int k = 2; k /*<= firstInteger / 2 && k <= secondInteger / 2*/ > 0/*<= firstInteger && k <= secondInteger*/; k++)
        {
            if(firstInteger % k == 0 && secondInteger % k == 0)
            {
                gcd = k;
                k++;
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("The greatest common divisor for " + firstInteger + " and " + secondInteger
         + " is " + gcd);
        System.out.println("The project spend " + (finishTime - startTime) + " seconds");
    }
}
