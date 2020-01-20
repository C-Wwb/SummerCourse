import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input an integer for second:");
        double second = input.nextDouble();
        int minute = (int) (second/60);
        double hour;
        if(minute <= 60)
        {
            hour = 0;
        }
        else
        {
            hour = minute/60;
        }
        System.out.println("The time is " + hour + " hour " + minute % 60 + " minute " + second % 60 + " second");
    }
}
