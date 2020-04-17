import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students: ");
        int number = input.nextInt();
        System.out.println("Please enter " + number + " scores: ");
        double[] score = new double[number];
        double best = 0;
        for(int i = 0; i < score.length; i++)
        {
            score[i] = input.nextDouble();
            if(score[i] > best)
            {
                best = score[i];
            }
        }
        for(int i = 0; i < score.length; i++)
        {
            System.out.println("Student " + i + " score is " + score[i]
                    + " and grade is " + judge(score[i], best));
        }
    }
    public static String judge(double score, double best)
    {
            if(score >= best - 10)
            {
                return "A";
            }
            else if(score >= best - 20)
            {
                return  "B";
            }
            else if(score >= best - 30)
            {
                return  "C";
            }
            else if(score >= best - 40)
            {
                return  "D";
            }
            else
            {
                return  "F";
            }
    }
}
