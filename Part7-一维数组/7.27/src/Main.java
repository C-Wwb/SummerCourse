import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] list1 = {3,2,1};
        int[] list2 = {2,2,3};
        java.util.Arrays.sort(list1);
        java.util.Arrays.sort(list2);
        if(Arrays.equals(list1, list2)) {
            System.out.println("Two list are identical");
        } else {
            System.out.println("Two list are not identical");
        }
    }
}
