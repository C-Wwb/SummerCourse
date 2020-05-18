import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of points: ");
        int numberOfPoints = input.nextInt();
        System.out.println("Please enter " + numberOfPoints + " points: ");
        double[][] point = new double[numberOfPoints][2];
        for(int i = 0; i < numberOfPoints; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                point[i][j] = input.nextDouble();
            }
        }
        double shortDistance = 100;
        int row1 = 0;
        int row2 = 0;//记录是哪两个点
        for(int i = 0; i < numberOfPoints; i++)
        {
            for(int j = i + 1; j < numberOfPoints; j++)
            {
                if(shortDistance > distance(point[i][0], point[i][1], point[j][0], point[j][1]))
                {
                    shortDistance = distance(point[i][0], point[i][1], point[j][0], point[j][1]);
                    row1 = i;
                    row2 = j;
                }
            }
        }
        System.out.println("The closest two points are (" + point[row1][0] + ", " + point[row1][1] + ") and ("
                + point[row2][0] + ", " + point[row2][1] + ")");
    }
    public static double distance(double x1, double y1, double x2, double y2)//计算两点之间的距离
    {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

}
