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
        System.out.println("Please enter the key: ");
        int key = input.nextInt();
        System.out.println(linearSearch(list, key));
    }
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
    {
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
}
