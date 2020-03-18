import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat d = new DecimalFormat("0.0000");
        System.out.println("i\t\t\tm(i)");
        for(int i = 0; i < 10; i ++)
        {
            System.out.println((i * 100 + 1) + "\t\t\t" + d.format(displayPI((i * 100 + 1))));
        }
    }
    public static double displayPI(int n)
    {
        double sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum +=  4 * (Math.pow(-1 , i + 1) / (2 * i - 1));
        }
        return sum;
    }
}
//4 * (Math.pow((-1),(i+1)) / ((2*i) - 1))