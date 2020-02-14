import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int theNumberOfQuestion = 0;
        int totalQuestion = 9;
        int correct = 0;
        String thePaperOverview = "";
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 100; i++)
        {
            int number1 = (int)(Math.random() * 14 + 1);
            int number2 = (int)(Math.random() * 14 + 1);
            System.out.println("What is " + number1 + " + " + number2 + "?");
            int answer = input.nextInt();
            if(theNumberOfQuestion < totalQuestion)
            {
                if(number1 + number2 == answer)
                {
                    System.out.println("You are correct!\n");
                    correct++;
                }
                else
                {
                    System.out.println("Your answer is wrong.\n"
                            + number1 + " + " + number2 + " should be " + (number1 + number2) + "\n");
                }
                theNumberOfQuestion ++;
                thePaperOverview += number1 + " + " + number2 + " = " + answer
                        + " " + ((number1 + number2 == answer) ? "correct\n" : "wrong\n");
            }
            else
            {
                break;
            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println("\nCorrect count is " + (correct + 1));
        System.out.println("Test time is " + (endTime - startTime) + " seconds\n\n" + thePaperOverview);

    }
}
