import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a decimal value(0 to 15):");
        int decimal = input.nextInt();
        if(decimal == 0)
        {
            System.out.println("The hex value is 0");
        }
        else if(decimal == 1)
        {
            System.out.println("The hex value is 1");
        }
        else if(decimal == 2)
        {
            System.out.println("The hex value is 2");
        }
        else if(decimal == 3)
        {
            System.out.println("The hex value is 3");
        }
        else if(decimal == 4)
        {
            System.out.println("The hex value is 4");
        }
        else if(decimal == 5)
        {
            System.out.println("The hex value is 5");
        }
        else if(decimal == 6)
        {
            System.out.println("The hex value is 6");
        }
        else if(decimal == 7)
        {
            System.out.println("The hex value is 7");
        }
        else if(decimal == 8)
        {
            System.out.println("The hex value is 8");
        }
        else if(decimal == 9)
        {
            System.out.println("The hex value is 9");
        }
        else if(decimal == 10)
        {
            System.out.println("The hex value is A");
        }
        else if(decimal == 11)
        {
            System.out.println("The hex value is B");
        }
        else if(decimal == 12)
        {
            System.out.println("The hex value is C");
        }
        else if(decimal == 13)
        {
            System.out.println("The hex value is D");
        }
        else if(decimal == 14)
        {
            System.out.println("The hex value is E");
        }
        else if(decimal == 15)
        {
            System.out.println("The hex value is F");
        }
        else
        {
            System.out.println(decimal + " is an invalid input");
        }
    }
}
