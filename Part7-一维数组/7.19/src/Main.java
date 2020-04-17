import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the list: ");
        int size = input.nextInt();
        System.out.println("Please enter the contents of the list: ");
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("The list has " + size + " integers: " + java.util.Arrays.toString(list));
        if (isSorted(list)) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++)
        {
            if (list[i] > list[i + 1])
            {
                return false;
            }
        }
        return true;
    }
}
