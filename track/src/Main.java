import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String love = input.nextLine();
        if(love.equalsIgnoreCase("Do you love me?"))
        {
            System.out.println("I love you my sweety");
        }
    }
}
