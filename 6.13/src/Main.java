import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        displaySum();
    }
    public static void displaySum()
    {
        double sum = 0;
        System.out.println("i\t\t\tm(i)");
        for(int i = 1; i <= 20; i++)
        {
            sum += i * 1.0 / (i + 1);
            System.out.println(i + "\t\t\t" + String.format("%.4f" , sum));
        }
    }
}
