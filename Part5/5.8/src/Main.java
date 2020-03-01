import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students:");
        int numberOfStudent = input.nextInt();
        String[] name = new String[numberOfStudent];
        String theHighestScoreName = "";
        double[] grade = new double[numberOfStudent];
        double theHightestScore = grade[0];
       System.out.println("Please enter students name and grades:");
        for(int i = 0; i < numberOfStudent; i++)
        {
            name[i] = input.next();
            grade[i] = input.nextDouble();
            if(grade[i] > theHightestScore)
            {
                theHighestScoreName = name[i];
                theHightestScore = grade[i];
            }
        }
        System.out.println("The highest score among the students was "
                + theHighestScoreName + " `s " + theHightestScore);
    }
}
