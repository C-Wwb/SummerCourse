import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter grade:");
        String letterGrade = input.next();
        if(letterGrade.equalsIgnoreCase("A"))
        {
            System.out.println("The numeric value of grade " + letterGrade.toUpperCase() + " is 4");
        }
        else if(letterGrade.equalsIgnoreCase("B"))
        {
            System.out.println("The numeric value of grade " + letterGrade.toUpperCase() + " is 3");
        }
        else if(letterGrade.equalsIgnoreCase("C"))
        {
            System.out.println("The numeric value of grade " + letterGrade.toUpperCase() + " is 2");
        }
        else if(letterGrade.equalsIgnoreCase("D"))
        {
            System.out.println("The numeric value of grade " + letterGrade.toUpperCase() + " is 1");
        }
        else if(letterGrade.equalsIgnoreCase("F"))
        {
            System.out.println("The numeric value of grade " + letterGrade.toUpperCase() + " is 0");
        }
        else
        {
            System.out.println(letterGrade + " is an invalid grade");
        }
    }
}
