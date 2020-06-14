import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }
        System.out.println(sum(array, array.length));
    }
    public static int sum(int[] array, int index)
    {
        if(index == 0)
        {
            return 0;
        }
        return array[index - 1] + sum(array, index - 1);
    }
}
