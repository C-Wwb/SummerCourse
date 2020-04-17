import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        double[] array = {1, 9.6, 0.26, 8.5, 66.4 ,65.4, 17};
        java.util.Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(java.util.Arrays.binarySearch(array, 8.5));


        char[] ch = {'a', 'f', 'r', 'd', ';'};
        java.util.Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        double[] array2 = {1, 9.6, 0.26, 8.5, 66.4 ,65.4, 17};
        java.util.Arrays.sort(array2, 0, 5);
        System.out.println(Arrays.toString(array2));

        double[] array3 = {1, 9.6, 0.26, 8.5, 66.4 ,65.4, 17};
        java.util.Arrays.sort(array3, 0, 3);
        System.out.println(Arrays.toString(array3));

        System.out.println(Arrays.equals(array2, array3));

        double[] array4 = {1, 9.6, 0.26, 8.5, 66.4 ,65.4, 17};
        java.util.Arrays.fill(array4, 1, 3, 6);
        System.out.println(Arrays.toString(array4));


    }
}
