import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        compare(num1, num2, num3);

    }
    public static void compare(int a, int b, int c)
    {
        int t;
        if(a > b)
        {
            if(b > c)
            {
                System.out.println(c + " < " + b + " < " + a);
            }
            else if(b < c && a > c)
            {
                System.out.println(b + " < " + c + " < " + a);
            }
            else if(a < c)
            {
                System.out.println(b + " < " + a + " < " + c);
            }
        }
        else if(a < b)
        {
            if(a < c && b > c)
            {
                System.out.println(a + " < " + c + " < " + b);
            }
            else if(b < c)
            {
                System.out.println(a + " < " + b + " < " + c);
            }
        }
    }
}

