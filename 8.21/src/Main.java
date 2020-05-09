import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of cities: ");
        int number = input.nextInt();
        System.out.println("Please enter the coordinates of the cities: ");
        double[][] coordinates = new double[number][2];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 2; j++) {
                coordinates[i][j] = input.nextDouble();
            }
        }
        centralCity(coordinates, number);
    }

    public static void centralCity(double[][] coordinates, int number) {
        double[] totalDistance = new double[number];
        double total = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                totalDistance[i] +=
                        distance(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);
            }
        }
        double max = Arrays.stream(totalDistance).max().getAsDouble();
        for (int i = 0; i < number; i++) {
            if (totalDistance[i] == max) {
                System.out.println("The central city is at ("
                        + coordinates[i][0] + ", " + coordinates[i][1] + ")"
                        + "\nThe total distance to all other cities is " + max);
            }
        }
    }

    public static double distance(double x1, double y1, double x2, double y2)//计算两点之间的距离
    {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
/*
text
2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
 */