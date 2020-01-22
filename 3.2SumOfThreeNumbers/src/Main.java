import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double  num1 = (int)(Math.random() * 10),
                num2 = (int)(Math.random() * 10),
                num3 = (int)(Math.random() * 10);
        System.out.println("There are three numbers: " + num1 + " + " + num2 + " + " +  num3 + " =? \n" +
                "Please enter sum of three numbers: ");
        int sum = input.nextInt();
        if (sum == num1 + num2 + num3)
        {
            System.out.println("I love u baby");
        }
        else
        {
            System.out.println("Biu");
        }

    }
}
