import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double mean = 0;
        double standardDeviation = 0;
        double sum = 0;
        double standard = 0;
        System.out.println("Please enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        double[] number = new double[10];
        for(int i = 0; i < 10; i++)
        {
            number[i] = input.nextDouble();
            sum += number[i];
            mean = sum / 10;
            standardDeviation += Math.pow((number[i] - mean) , 2);
            standard = Math.sqrt(standardDeviation / 9);
        }

        System.out.println("The mean is " + String.format("%.2f" , mean));
        System.out.println("The standard deviation is " + String.format("%.2f" , standard));

    }
}
//s = Math.pow((number[i] - mean) , 2) / (n - 1);