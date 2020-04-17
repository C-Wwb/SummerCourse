import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of array: ");
        int number = input.nextInt();
        double[] list = new double[number];
        System.out.println("The array is " + Arrays.toString(getRandom(list)));
    }
    public static double[] getRandom(double...numbers)
    {
        for(int i = 0; i < numbers.length; i++)
        {
            double randomNumber = (int)(Math.random() * 54 + 1);
            numbers[i] = randomNumber;
        }
        return numbers;
    }
}
