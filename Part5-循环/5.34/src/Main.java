import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while(count < 2)
        {
            System.out.println("scissor(0), rock(1), paper(2):");
            int urOption = input.nextInt();
            int computerOption = (int)(Math.random() * 3);
            if(urOption == 0)
            {
                System.out.print("You are scissor. ");
                if(computerOption == 0)
                {
                    System.out.println("The computer is scissor too. It is a draw.\n");
                }
                else if(computerOption == 1)
                {
                    System.out.println("The computer is rock. You lose.\n");
                }
                else
                {
                    System.out.println("The computer is paper. You win.\n");
                    count++;
                }
            }
            else if(urOption == 1)
            {
                System.out.print("You are rock. ");
                if(computerOption == 0)
                {
                    System.out.println("The computer is scissor. You win.\n");
                    count++;
                }
                else if(computerOption == 1)
                {
                    System.out.println("The computer is rock. It is a draw.\n");
                }
                else
                {
                    System.out.println("The computer is paper. You lose.\n");
                }
            }
            else
            {
                System.out.print("You are paper. ");
                if(computerOption == 0)
                {
                    System.out.println("The computer is scissor. You lose.\n");
                }
                else if(computerOption == 1)
                {
                    System.out.println("The computer is rock. You win.\n");
                    count++;
                }
                else
                {
                    System.out.println("The computer is paper. It is a draw.\n");
                }
            }
        }
        System.out.println("\nCongratulations!!! you've won two games!!!");


    }
}
