import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input three number:\n");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double average = (a + b + c)/3;
        System.out.print("The average of a,b,c is \n" + average);
    }
}
