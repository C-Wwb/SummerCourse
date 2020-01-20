import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter x1 and y1:");
        double  x1 = input.nextDouble(),
                y1 = input.nextDouble();
        System.out.println("Please enter x2 and y2:");
        double  x2 = input.nextDouble(),
                y2 = input.nextDouble(),
                distance = Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2));
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The distance between the two points is " + d.format(distance));
    }
}
