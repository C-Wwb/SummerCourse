import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        double result = 0;
        DecimalFormat d = new DecimalFormat("0.00");
        for(int i = 100; i >= 1; i -= 2)
        {
            result += i / (i + 2.0);
        }
        System.out.println(d.format(result));
    }
}
