import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random() * 12 + 1);
        System.out.println("The number is " + number);
        if(number == 1)
        {
            System.out.println("The corresponding month for this number is Jan");
        }
        if(number == 2)
        {
            System.out.println("The corresponding month for this number is Feb");
        }
        if(number == 3)
        {
            System.out.println("The corresponding month for this number is Mar");
        }
        if(number == 4)
        {
            System.out.println("The corresponding month for this number is Apr");
        }
        if(number == 5)
        {
            System.out.println("The corresponding month for this number is May");
        }
        if(number == 6)
        {
            System.out.println("The corresponding month for this number is Jun");
        }
        if(number == 7)
        {
            System.out.println("The corresponding month for this number is Jul");
        }
        if(number == 8)
        {
            System.out.println("The corresponding month for this number is Aug");
        }
        if(number == 9)
        {
            System.out.println("The corresponding month for this number is Sep");
        }
        if(number == 10)
        {
            System.out.println("The corresponding month for this number is Oct");
        }
        if(number == 11)
        {
            System.out.println("The corresponding month for this number is Nov");
        }
        if(number == 12)
        {
            System.out.println("The corresponding month for this number is Dec");
        }
    }

}
