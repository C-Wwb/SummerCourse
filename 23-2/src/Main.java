import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
       int[] list = {0, 5, 1, 4, 7};
       bubbleSort(list);
       System.out.println(Arrays.toString(list));
    }
    public static void bubbleSort(int[] list)
    {
        for (int k = 1; k < list.length; k++)
        {
            for (int i = 0; i < list.length - k; i++)
            {
                if (list[i] > list[i + 1])
                {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }
}
