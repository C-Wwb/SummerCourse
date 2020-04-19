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
        judge(option, numberOfStudent, numberOfOption);
    }
    public static void judge(String[][] option, int numberOfStudent, int numberOfOption)
    {
        String[] standard = {"A", "A", "B", "C", "D", "B", "C", "D"};
        int correctOption = 0;
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
            System.out.println("The number " + (i + 1) + " student`s correct option is: " + correctOption);
        }
    }
}
