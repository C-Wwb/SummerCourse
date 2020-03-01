import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first 9 digits of an ISBN as integer: ");
        double sum = 0;
        String ISBN = input.next();
        for(int i = 1; i <= 9; i++)
        {
            double d = ISBN.charAt(i - 1) - 48;
            sum += d * i;
        }
        int ISBN10;
        ISBN10 = (int) (sum % 11);
        if(ISBN10 == 10)
        {
            System.out.println(ISBN + "X");
        }
        else
        {
            System.out.println(ISBN + ISBN10);
        }

    }
}
