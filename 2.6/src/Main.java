import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 100:");
        double  number = input.nextDouble(),
                intHundred = (int)number / 100,
                intTen = (int)number % 100 / 10,
                intSingle = number % 100 % 10,
                total = intHundred + intTen + intSingle;
        DecimalFormat d = new DecimalFormat("0.0");
        System.out.println("The sum of the digits is " + d.format(total));


    }
}
