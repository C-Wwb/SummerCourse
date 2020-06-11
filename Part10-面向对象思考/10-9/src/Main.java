import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n = input.nextInt();
        System.out.println(factorial(n));
    }
    public static BigInteger factorial(long n)
    {
        BigInteger result = BigInteger.ONE;
        for(int i = 0; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));
        return result;
    }
}
