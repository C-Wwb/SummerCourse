import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] array = new double[3];
        System.out.println("Please enter the array: ");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextDouble();
        }
        System.out.println(sum(array));
    }
    public static ArrayList<Double> sum(double[] array)
    {
        ArrayList<Double> list = new ArrayList<Double>();
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i + 1; j < array.length; j++)
            {
                list.add(array[i] + array[j]);
            }
        }
        return list;
    }
}
