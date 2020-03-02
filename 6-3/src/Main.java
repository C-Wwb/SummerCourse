import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a grade: ");
        double grade = input.nextDouble();
        System.out.print("The grade is: " + printGrade(grade));

    }
    public static String printGrade(double grade)
    {
        if(grade >= 90)
        {
            return "A";
        }
        if(grade >= 80)
        {
            return "B";
        }
        if(grade >= 70)
        {
            return "C";
        }
        if(grade >= 60)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }
}
