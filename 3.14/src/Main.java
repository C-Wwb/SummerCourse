import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess whether the coin is heads or tails(1 or 0):");
        int guess = input.nextInt();
        int reality = (int)(Math.random());
        if(guess == reality)
        {
            System.out.println("the reality is " + reality + "\nU win");
        }
        else if (guess != reality)
        {
            System.out.println("the reality is " + reality + "\nU lose");
        }
    }
}
