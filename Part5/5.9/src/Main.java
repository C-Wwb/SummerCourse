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
        String theSecondScoreName = "";
        double[] grade = new double[numberOfStudent];
        double theHightestScore = 0;
        double theSecondScore = 0;
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
            else if(grade[i] > theSecondScore)
            {
                theSecondScoreName = name[i];
                theSecondScore = grade[i];
            }
        }
        System.out.println("The highest score among the students was "
                + theHighestScoreName + " `s " + theHightestScore);
        System.out.println("The second score among the students was "
                + theSecondScoreName + " `s " + theSecondScore);
    }
}
