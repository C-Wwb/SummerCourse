import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter array: ");
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }
        if(isConsecutiveFour(array))
        {
            System.out.println("The list has consecutive fours");
        }
        else if(!isConsecutiveFour(array))
        {
            System.out.println("The list has no consecutive fours");
        }
    }
    public static boolean isConsecutiveFour(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            return array[i] == array[i + 1];
        }
        return false;
    }
}
