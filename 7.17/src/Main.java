import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of student: ");
        int numberOfStudent = input.nextInt();
        String[] name = new String[numberOfStudent];
        double[] grade = new double[numberOfStudent];
        System.out.println("Please enter student`s name and grade: ");
        for(int i = 0; i < grade.length; i++)
        {
            name[i] = input.next();
            grade[i] = input.nextDouble();
        }
        java.util.Arrays.sort(grade);
        System.out.println("After in descending order: ");
        for(int i = grade.length - 1; i >= 0; i--)
        {
            System.out.println(name[i] + " " + grade[i]);
        }
    }
}
