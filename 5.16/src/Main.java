import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int integer = input.nextInt();
        int factor = 0;
        System.out.println("The minimum factor of " + integer + " is");
        for(int i = 2; i > 0; i++)
        {
                if(integer % i == 0)
                {
                    factor = i;
                    integer /= i;
                    i--;
                    System.out.print(factor + " ");
                }
                else
                {
                    break;
                }
        }
    }
}

