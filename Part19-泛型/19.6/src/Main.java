import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of list: ");
        int size = input.nextInt();
        Integer[][] list = new Integer[size][size];
        System.out.println("Please enter the array: ");
        for(int i = 0; i < list.length; i++)
        {
            for(int j = 0; j < list.length; j++)
            {
                list[i][j] = input.nextInt();
            }
        }
        System.out.println(max(list));
    }
    public static <E extends Comparable<E>> E max(E[][] list)
    {
        E max = list[0][0];
        for (E[] es : list) {
            for (int j = 0; j < list.length; j++) {
                if (max.compareTo(es[j]) < 0) {
                    max = es[j];
                }
            }
        }
        return max;
    }
}
