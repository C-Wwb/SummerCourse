import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter a series of numbers ending with 0: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }
        int index = 0;
        int count = 1;
        int temp = 1;
        int element = 0;
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] == array[i + 1])
            {
                temp++;
            }
            else
            {
                count = Math.max(temp, count);
                if (count == temp)
                {
                    index = i;
                    element = array[i];
                }
                temp = 0;
            }
        }
        System.out.println("The longest same number sequence starts at index " + (index - count) + " with " + (count + 1)
                + " values of " + element);
    }
}
/*
11
2 4 4 8 8 8 8 2 4 4 0
 */