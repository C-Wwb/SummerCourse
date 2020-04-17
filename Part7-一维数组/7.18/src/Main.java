import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of array: ");
        int n = input.nextInt();
        System.out.println("Please enter the array: ");
        double[] array = new double[n];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextDouble();
        }
        System.out.println("The array is: " + java.util.Arrays.toString(bubbleSort(array)));
    }
    public static double[] bubbleSort(double[] numbers)
    {
        double temp;
        for(int i = 0; i < numbers.length - 1; i++)
        {
            for(int j = 0; j < numbers.length - 1 - i; j++)
            {
                if(numbers[j] > numbers[j + 1])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
}
