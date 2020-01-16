import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the subtotal and a gratuity rate:");
        double  subtotal = input.nextDouble(),
                GratuityRate = input.nextDouble(),
                gratuity = subtotal * GratuityRate / 100,
                total = subtotal + gratuity;
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The gratuity is $" + d.format(gratuity) + " and total is $" + d.format(total));

    }
}
