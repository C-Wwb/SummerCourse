import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first 9 digit of an ISBN as integer: ");
        int     a = input.nextInt(),
                b = input.nextInt(),
                c = input.nextInt(),
                d = input.nextInt(),
                e = input.nextInt(),
                f = input.nextInt(),
                g = input.nextInt(),
                h = input.nextInt(),
                i = input.nextInt(),
                ISBN = (a * 1 + b * 2 + c * 3 + d * 4 + e * 5 + f * 6 + g * 7 + h * 8 + i * 9) % 11;
        if(ISBN == 10)
        {
            System.out.println("The ISBN-10 number is: " + a + b + c + d + e + f + g + h + i + "X");
        }
        else
        {
            System.out.println("The ISBN-10 number is: " + a + b + c + d + e + f + g + h + i + ISBN);
        }
    }
}
