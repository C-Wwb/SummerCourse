import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two characters:");
        String information = input.next();
        char professional = information.charAt(0);
        char grade = information.charAt(1);
        System.out.print(professionalDisplay(professional) + " " + gradeDisplay(grade));
    }

    public static String professionalDisplay(char ch)
    {
        if(ch == 'M')
        {
            System.out.print("Mathematics");
        }
        else if(ch == 'C')
        {
            System.out.print("Computer Science");
        }
        else if(ch == 'I')
        {
            System.out.print("Information Technology");
        }
        else
        {
            System.out.print("Invalid input");
        }
        return "";
    }
    public static String gradeDisplay(char ch)
    {
        if(ch == '1')
        {
            System.out.print(" Freshman");
        }
        else if(ch == '2')
        {
            System.out.print(" Sophomore");
        }
        else if(ch == '3')
        {
            System.out.print(" Junior");
        }
        else if(ch == '4')
        {
            System.out.print(" Senior");
        }
        else
        {
            System.out.print("Invalid input");
        }
        return "";
    }
}

