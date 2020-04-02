import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter seconds: ");
        long seconds = input.nextInt();
        System.out.println(convertMillis(seconds));
    }
    public static String convertMillis(long millis)
    {
        long hou;
        long min;
        long mil;
        hou = millis / 3600;
        min = (millis % 3600) / 60;
        mil = (millis % 3600) % 60;
        return hou + " : " + min + " : " + mil;
    }
}
