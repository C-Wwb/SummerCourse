import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter weight in pounds:");
        double pounds = input.nextDouble();
        System.out.println("Please enter height in inches:");
        double  inches = input.nextDouble(),
                kilograms = pounds * 0.45359237,
                meters = inches * 0.0254,
                BMI = kilograms / Math.pow(meters , 2);
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("BMI is " + d.format(BMI));

    }
}
