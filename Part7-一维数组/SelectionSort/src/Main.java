import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of list: ");
        int n = input.nextInt();
        double[] list = new double[n];
        System.out.println("Please enter the list: ");
        for(int i = 0; i < list.length; i++)
        {
            list[i] = input.nextDouble();
        }
        selectionSort(list);
    }
    public static void selectionSort(double[] list)
    {
        for(int i = 0; i < list.length - 1; i++)
        {
            double needSort = list[i];
            int currentIndex = i;
            for(int j = i + 1; j < list.length; j++)
            {
                if(needSort > list[j])
                {
                   needSort = list[j];
                   currentIndex = j;
                }
            }
            if(needSort != i)
            {
                list[currentIndex] = list[i];
                list[i] = needSort;
            }
        }
    }
}
