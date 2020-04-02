import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of scores:");
        int number = input.nextInt();
        System.out.println("Please enter the scores:");
        double[] score = new double[number];
        double highest = score[0];
        for(int i = 0; i < number; i++)
        {
            score[i] = input.nextDouble();
            if(score[i] > highest)
            {
                highest = score[i];
            }
        }
        System.out.println("the highest score is: " + highest);
    }
}
