import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number of radius:");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14;
        System.out.println("The area of circle is " + area);
    }
}
