import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int[] arr ={2,5,6,1,7};
        int key = -1;
        int j;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i - 1] > arr[i])
            {
                key = arr[i];
                for(j = i - 1; j >= 0 && arr[j] > key; j--)
                {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = key;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
