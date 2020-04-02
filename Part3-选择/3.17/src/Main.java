import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("scissor(0), rock(1), paper(2):");
        int urOption = input.nextInt();
        int computerOption = (int)(Math.random() * 3);
        if(urOption == 0)
        {
            System.out.print("You are scissor. ");
            if(computerOption == 0)
            {
                System.out.println("The computer is scissor too. It is a draw.");
            }
            else if(computerOption == 1)
            {
                System.out.println("The computer is rock. You lose.");
            }
            else
            {
                System.out.println("The computer is paper. You win.");
            }
        }
        else if(urOption == 1)
        {
            System.out.print("You are rock. ");
            if(computerOption == 0)
            {
                System.out.println("The computer is scissor. You win.");
            }
            else if(computerOption == 1)
            {
                System.out.println("The computer is rock. It is a draw.");
            }
            else
            {
                System.out.println("The computer is paper. You lose.");
            }
        }
        else
        {
            System.out.print("You are paper. ");
            if(computerOption == 0)
            {
                System.out.println("The computer is scissor. You lose.");
            }
            else if(computerOption == 1)
            {
                System.out.println("The computer is rock. You win.");
            }
            else
            {
                System.out.println("The computer is paper. It is a draw.");
            }
        }

    }
}
