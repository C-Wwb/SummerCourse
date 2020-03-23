import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("The number of array: ");
        int n = input.nextInt();
        System.out.println("Please enter array of numbers: ");
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        System.out.println("Please enter the key: ");
        int key = input.nextInt();
        System.out.println(binarySearch(numbers, key));

    }
    public static int binarySearch(int[] numbers, int key)
    {//查找返回下标
        int low = 0;
        int high = numbers.length - 1;
        while(high >= low)
        {
            int mid = (low + high) / 2;
            if(key < numbers[mid])
            {
                high = mid - 1;
            }
            else if(key == numbers[mid])
            {
                return mid;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -low - 1;
    }
}
