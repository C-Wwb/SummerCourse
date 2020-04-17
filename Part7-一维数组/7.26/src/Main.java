import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] list1 = {1,2,1};
        int[] list2 = {1,2,3};
        if(Arrays.equals(list1, list2)) {
            System.out.println("Two list are strictly identical");
        } else {
            System.out.println("Two list are not strictly identical");
        }
    }
}
