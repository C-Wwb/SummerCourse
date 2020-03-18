import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.println("Please enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is " + String.format("%.2f" , area(side, numberOfSides)));
    }
    public static double area(double side, int numberOfSides)
    {
        return ((numberOfSides * Math.pow(side , 2)) / (4 * (Math.tan(Math.PI / numberOfSides))));
    }
}
