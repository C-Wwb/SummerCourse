import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of items: ");
        int items = input.nextInt();
        System.out.println("Please enter the numbers: ");
        double[] numbers = new double[items];
        double sum = 0;
        double average = 0;
        int count = 0;
        for(int i = 0; i < items; i++)
        {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        average = sum / items;
        for(int i = 0; i < items; i++)
        {
            if(numbers[i] > average)
            {
                count++;
            }
        }
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }
}
