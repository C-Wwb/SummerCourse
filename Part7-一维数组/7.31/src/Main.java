import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array1 = {1, 6, 2, 3, 5, 9};
        int[] array2 = {1, 5, 6, 0, 3};
        System.out.println("array1 is :" + Arrays.toString(array1));
        System.out.println("array2 is :" + Arrays.toString(array2));
        int[] mergeArray = merge(array1, array2);
        Arrays.sort(mergeArray);
        System.out.println("The merge array is :" + Arrays.toString(mergeArray));
    }
    public static int[] merge(int[] array1, int[] array2)
    {
        int[] mergeArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergeArray, 0, array1.length);
        System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);
        return mergeArray;
    }
}
