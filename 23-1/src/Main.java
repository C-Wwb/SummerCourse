import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] list = {1, 9, 4, 6, 5, -4};
        insertSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void insertSort(int[] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            int current = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > current; j--)
            {
                list[j + 1] = list[j];
            }
            list[j + 1] = current;
        }
    }
}
