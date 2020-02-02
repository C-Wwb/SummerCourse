import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your lottery pick(two digits):");
        double lotteryPick = input.nextDouble();
        String lotteryNumber =" " + (int)(Math.random() * 10) + (int)(Math.random() * 10);
        System.out.println("The lottery number is " + lotteryNumber);
    }
}
