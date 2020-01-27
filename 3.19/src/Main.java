import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the three sides of the triangle:");
        double  side1 = input.nextDouble(),
                side2 = input.nextDouble(),
                side3 = input.nextDouble(),
                perimeter = 0;
        if(((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1))
        {
            perimeter = side1 + side2 + side3;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        }
        else
        {
            System.out.println("input error");
        }
    }
}
