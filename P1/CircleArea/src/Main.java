import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number of radius:");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area of circle is " + area);
    }
}
