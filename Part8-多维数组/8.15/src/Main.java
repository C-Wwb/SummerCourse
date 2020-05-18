import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter five points: ");
        double[][] points = new double[5][2];
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                points[i][j] = input.nextDouble();
            }
        }

        System.out.println(sameLine(points) ? "The five points are on the same line."
                : "The five points are on not the same line.");
    }
    public static boolean sameLine(double[][] points)
    {
        double k = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        int count = 0;
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 1; j++)
            {
                if((points[i + 1][j + 1] - points[i][j + 1]) / (points[i + 1][j] - points[i][j]) == k)
                {
                    count++;
                }
            }
        }
        return count == 4;
    }
}
