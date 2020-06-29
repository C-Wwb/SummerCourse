import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("The number of array: ");
        int n = input.nextInt();
        System.out.println("Please enter array of numbers: ");
        Integer[] numbers = new Integer[n];
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        System.out.println("Please enter the key: ");
        int key = input.nextInt();
        System.out.println(binarySearch(numbers, key));

    }
    public static <E extends  Comparable<E>> int binarySearch(E[] numbers, E key)
    {//查找返回下标
        int low = 0;
        int high = numbers.length - 1;
        while(high >= low)
        {
            int mid = (low + high) / 2;
            if(key.compareTo(numbers[mid]) < 0)
                high = mid - 1;
            else if(key == numbers[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;
    }
}
