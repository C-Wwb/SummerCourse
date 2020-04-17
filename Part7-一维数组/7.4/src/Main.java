import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] grades = new double[100];
        double average;
        double total = 0;
        double count = 0;
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("Please enter some of the grades and end up with negative number: ");
        for(int i = 0; i < grades.length; i++)
        {
            grades[i] = input.nextDouble();
            if(grades[i] < 0)
            {
                break;
            }
            else if(grades[i] > 0)
            {
                count++;
                total += grades[i];
            }
        }
        average = total / count;
        int countHigh = 0;
        int countLow = 0;
        for(int i = 0; i < count; i++)
        {
            if(grades[i] >= average)
            {
                countHigh++;
            }
            else if(grades[i] < average)
            {
                countLow++;
            }
        }
        System.out.println("Average is: " + d.format(average));
        System.out.println("There are " + countHigh + " more than the average");
        System.out.println("There are " + countLow + " more than the average");
    }
}
