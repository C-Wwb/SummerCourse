import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of circle:");
        double radius = input.nextDouble();
        System.out.println("Please enter a point(x,y):");
        double  abscissa = input.nextDouble(),
                ordinate = input.nextDouble(),
                distance = Math.sqrt(Math.pow(abscissa,2) + Math.pow(ordinate,2));
        if(distance == radius)
        {
            System.out.println("Point on the circle");
        }
        else if(distance > radius)
        {
            System.out.println("Point outside the circle");
        }
        else
        {
            System.out.println("Point inside the circle");
        }

    }
}
