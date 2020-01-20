import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Number1 = (int)(System.currentTimeMillis() % 10),
            Number2 = (int)(System.currentTimeMillis() / 10 % 10);
        System.out.println(Number1 + " * " + Number2 + " = ? ");
        int Answer = input.nextInt();
        DecimalFormat d = new DecimalFormat("0.00");
        if(Answer == Number1 * Number2)
        {
            System.out.println(Number1  + " * " + Number2 + " = " + Answer + " is true ");
        }
        else
        {
            System.out.println(Number1  + " * " + Number2 + " = " + Answer + " is false ");
        }
    }
}
