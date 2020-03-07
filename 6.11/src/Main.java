import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("SalesAmount\t\t\tRemuneration");
        DecimalFormat d = new DecimalFormat("0");
        DecimalFormat f = new DecimalFormat("0.0");
        for(int i = 1; i <= 19; i++)
        {
            System.out.print(d.format(5000 + 5000 * i) + "\t\t\t\t"
                    + f.format(computeCommission((5000 + 5000 * i))));
            System.out.println();
        }
    }
    public static double computeCommission(double salesAmount)
    {
        double remuneration;
        remuneration = 900 + (salesAmount - 10000) * 0.12;
        return remuneration;
    }
}
