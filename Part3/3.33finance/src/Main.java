import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter weight and price for package 1:");
        double weight1 = input.nextDouble(),
               price1 = input.nextDouble(),
               judge1 = price1 / weight1;
        System.out.println("Please enter weight and price for package 2:");
        double weight2 = input.nextDouble(),
               price2 = input.nextDouble(),
               judge2 = price2 / weight2;
        if(judge1 < judge2)
        {
            System.out.println("Package 1 has a better price");
        }
        else if(judge2 < judge1)
        {
            System.out.println("Package 2 has a better price");
        }
        else
        {
            System.out.println("Two packages have the same price");
        }

    }
}
