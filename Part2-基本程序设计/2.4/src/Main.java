import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number in pounds:");
        double  pounds = input.nextDouble(),
                kilograms = pounds * 0.454;
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println(d.format(pounds) + " pounds is " + d.format(kilograms) + " kilograms");
    }
}
