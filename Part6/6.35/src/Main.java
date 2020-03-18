import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please enter the side: ");
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is " + String.format("%.2f" , area(side)));
    }
    public static double area(double side)
    {
        return ((5 * Math.pow(side , 2)) / (4 * (Math.tan(Math.PI / 5))));
    }
}
