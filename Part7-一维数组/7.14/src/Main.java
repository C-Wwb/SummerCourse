import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of array: ");
        int number = input.nextInt();
        int[] list = new int[number];
        System.out.println("Please enter the array: ");
        for(int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
        }
        System.out.println("The gcd of list is: " + gcd(list));
    }
    public static int gcd(int...numbers)
    {
        int gcd, temp;
        gcd = numbers[0];
        for(int i = 0; i < (numbers.length - 1); i++)
        {
            temp = 0;
            while(numbers[i + 1] != 0)
                { temp = numbers[i+1];
                numbers[i+1] = gcd % numbers[i+1];
                gcd = temp;
            }
        }
        return gcd;
    }
}

