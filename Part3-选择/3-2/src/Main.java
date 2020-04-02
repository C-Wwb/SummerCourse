import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        double integer = input.nextDouble();
        if(integer % 5 == 0 && integer % 2 == 0)
        {
            System.out.println("HiFive\nHiEven");
        }
        else if(integer % 5 == 0)
        {
            System.out.println("HiFive");
        }
        else if(integer % 2 == 0)
        {
            System.out.println("HiEven");
        }

        else
        {
            System.out.println("Biu");
        }
    }
}
