import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 integers: ");
        double[] integers = new double[10];
        for(int i = 0; i < integers.length; i++)
        {
            integers[i] = input.nextDouble();
        }
        for(int i = integers.length - 1; i >= 0 ; i--)
        {
            System.out.print(integers[i] + " ");
        }
    }
}
