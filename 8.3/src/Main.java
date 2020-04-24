import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of student: ");
        int numberOfStudent = input.nextInt();
        System.out.println("Please enter the number of option: ");
        int numberOfOption = input.nextInt();
        System.out.println("Please enter option: ");
        String[][] option = new String[numberOfStudent][numberOfOption];
        for(int i = 0; i < numberOfStudent; i++) {
            for (int j = 0; j < numberOfOption; j++) {
                option[i][j] = input.next();
            }
        }
        System.out.println(Arrays.toString(judge(option, numberOfStudent, numberOfOption)));
    }
    public static String[] judge(String[][] option, int numberOfStudent, int numberOfOption)
    {
        String[] judge = new String[numberOfStudent];
        String[] eventually = new String[numberOfStudent];
        String[] standard = {"A", "A", "B", "C", "D", "B", "C", "D"};
        int correctOption;
        for(int i = 0; i < numberOfStudent; i++)
        {
            correctOption = 0;
            for(int j = 0; j < numberOfOption; j++)
            {
                if(option[i][j].equals(standard[j]))
                {
                    correctOption++;
                }
            }
            judge[i] = "The number " + (i + 1) + " student`s correct option is: " + correctOption + "\n";
        }
        for(int i = 0; i < numberOfStudent - 1; i++) {
            if((int)judge[i].charAt(42) < (int)judge[i + 1].charAt(42))
            {
                eventually[i] = judge[i];
            }
        }
        return eventually;
    }
}
