import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of list: ");
        int size = input.nextInt();
        Integer[] list = new Integer[size];
        System.out.println("Please enter the array: ");
        for(int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
        }
        System.out.println(max(list));
    }
    public static <E extends Comparable<E>> E max(E[] list)
    {
        return Collections.max(Arrays.asList(list));
    }
}

