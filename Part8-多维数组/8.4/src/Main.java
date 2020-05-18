import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of employee: ");
        int numberOfEm = input.nextInt();
        int[][] em = new int[numberOfEm][7];
        System.out.println("Please enter some information: ");
        for(int i = 0; i < numberOfEm; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                em[i][j] = input.nextInt();
            }
        }
        swap(em, numberOfEm);
    }
    public static void swap(int[][] em, int numberOfEm)
    {
        int[] information = new int[numberOfEm];
        int[] number = new int[numberOfEm];
        for(int i = 0; i < numberOfEm; i++)
        {
            information[i] = 0;
            number[i] = i;
        }
        int sum = 0;
        for(int i = 0; i < numberOfEm; i++) {
            for (int j = 0; j < 7; j++) {
                sum += em[i][j];
            }
            information[i] += sum;
            sum = 0;
        }
        for(int i = 0; i < numberOfEm; i++)
        {
            for(int j = i + 1; j < numberOfEm; j++)
            {
                if(information[i] < information[j])
                {
                    int tempHours = information[j];
                    information[j] = information[i];
                    information[i] = tempHours;

                    int tempNumber = number[j];
                    number[j] = number[i];
                    number[i] = tempNumber;
                }
            }
        }
        for(int i = 0; i < numberOfEm - 1; i++)
        {
            System.out.println("The employee " + number[i] + " works " + information[i] + " hours a week.");
        }
    }
}
/*
text:
    2 4 3 4 5 8 8
    7 3 4 3 3 4 4
    3 3 4 3 3 2 2
    9 3 4 7 3 4 1
    3 5 4 3 6 3 8
    3 4 4 6 3 4 4
    3 7 4 8 3 8 4
    6 3 5 9 2 7 9
 */