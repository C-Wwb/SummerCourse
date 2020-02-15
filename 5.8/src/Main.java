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
        double theHightestScore = -1;
       /* System.out.println("Please enter students name:");
        for(int i = 0; i < numberOfStudent; i++)
        {
            name[i] = input.next();
        }*/
        System.out.println("Please enter students grade:");
        for(int i = 1; i < numberOfStudent; i++)
        {
            grade[i] = input.nextDouble();
            if(grade[i] > grade[i + 1])
            {
                //theHighestScoreName = name[i + 1];
                theHightestScore = grade[i];
            }
        }
        System.out.println("The highest score among the students was "
                /*+ theHighestScoreName + " `s " */+ theHightestScore);
    }
}
