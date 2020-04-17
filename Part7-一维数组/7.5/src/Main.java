import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers of array: ");
        int n = input.nextInt();
        System.out.println("Please enter " + n + " numbers: ");
        double[] numbers = new double[n];
        ArrayList<Double> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextDouble();
        }
        java.util.Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++)
        {
            list.add(numbers[i]);
        }
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                if(numbers[i] == numbers[j])
                {
                    list.remove(numbers[j]);
                    count++;
                    break;
                }

            }
        }
        System.out.println("The number of distinct numbers is " + (numbers.length - count));
        System.out.println("The distinct numbers are: " + list);
    }

}
