import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a Celsius:");
        double Fahrenheit = input.nextDouble();
        double Celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit " + Fahrenheit + " is " + Celsius + " in Celsius");
    }
}
