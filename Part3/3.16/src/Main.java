import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Displays the coordinates of random points in the rectangle: ");
        double abscissa = Math.random() * 200 - 200;
        double ordinate = Math.random() * 100 - 100;
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The coordinates of the random points are (" + d.format(abscissa)
                + "," + d.format(ordinate) + ")");
    }
}
