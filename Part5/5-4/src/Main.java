import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final int theNumberOfQuestion = 5;
        int currentQuestion = 0;
        Scanner input = new Scanner(System.in);
        int answer = 100;
        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        while(currentQuestion < theNumberOfQuestion)
        {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            int correctAnswer = number1 - number2;
            System.out.println("What is " + number1 + " - " + number2 + "?");
            answer = input.nextInt();
            if((number1 - number2) == answer)
                {
                    System.out.println("\nYou are correct!");
                    correctCount++;
                }
                else if((number1 - number2) != answer)
                {
                    System.out.println("\nYou are wrong.\n" + number1 + " - " + number2 + " should be " + correctAnswer);
                }
            currentQuestion ++;
                output += "\n" + number1 + " - " + number2 + " = "
                        + answer + (((number1 - number2) == answer) ? " correct": " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
            System.out.println("\nCorrect count is " + correctCount + "\nTest time is " + testTime + " seconds"
            +output);
        }

    }

