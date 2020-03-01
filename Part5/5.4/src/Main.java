import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("miles          kilometer");
        DecimalFormat d = new DecimalFormat("0.000");
        for(int miles = 1; miles <= 10; miles++)
        {
            double kilometer = miles * 1.609;
            System.out.print(miles + "              " + d.format(kilometer) + "\n");
        }
    }
}
