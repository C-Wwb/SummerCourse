import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a grade: ");
        double grade = input.nextDouble();
        System.out.print("The grade is: ");
        printGrade(grade);
    }
    public static void printGrade(double grade)
    {
        if(grade >= 90)
        {
            System.out.println("A");
        }
        if(grade >= 80)
        {
            System.out.println("B");
        }
        if(grade >= 70)
        {
            System.out.println("C");
        }
        if(grade >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
}