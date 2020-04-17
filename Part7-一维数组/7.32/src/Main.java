import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of list: ");
        int size = input.nextInt();
        System.out.println("Please enter the list: ");
        int[] list = new int[size];
        for(int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
        }
        System.out.println("After the partition, the list is: " + partition(list));
    }
    public static Stack<Integer> partition(int[] list)
    {
        int pivot = list[0];
        Stack<Integer> partitionList = new Stack<>();
        for(int i = 1; i < list.length; i++)
        {
            if(list[i] < pivot)
            {
                partitionList.push(list[i]);
            }
        }
        partitionList.push(pivot);
        for(int i = 1; i < list.length; i++)
        {
            if(list[i] > pivot)
            {
                partitionList.push(list[i]);
            }
        }

        return partitionList;
    }
}
