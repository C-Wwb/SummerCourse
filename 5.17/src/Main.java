import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer(from 1 to 15):");
        int integer = input.nextInt();
        int line,space,leftNumber,rightNumber;
        for(line = 1; line <= integer; line++)
        {
            for(space = 1;space <= integer - line; space++)
                System.out.print("  ");

            for(leftNumber = line; leftNumber >= 1; leftNumber--)
                System.out.print(leftNumber + " ");

            for(rightNumber = 2; rightNumber <= line; rightNumber++)
                System.out.print(rightNumber + " " );
                System.out.println();

        }
    }
}
