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
        shuffle(list);
        System.out.println(Arrays.toString(list));
    }
    public static <E> void shuffle(Integer[] list)
    {
        Collections.shuffle(Arrays.asList(list));
    }

}
