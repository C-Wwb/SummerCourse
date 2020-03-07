import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Foot" + "\t\t" + "Meter" + "\t\t\t" + "Meter" + "\t\t" + "Foot");
        DecimalFormat d = new DecimalFormat("0.0");
        DecimalFormat f = new DecimalFormat("0.000");
        for(int i = 1; i <= 10; i++)
        {
            System.out.print(d.format(i) + "\t\t" + f.format(footToMeter(i))
                    + "\t\t\t\t" + d.format((15 + i * 5)) + "\t\t\t" + f.format(meterToFoot(15 + i * 5)));
            System.out.println();
        }
    }
    public static double footToMeter(double foot)
    {
        double meter;
        meter = 0.305 * foot;
        return meter;
    }
    public static double meterToFoot(double meter)
    {
        double foot;
        foot = 3.279 * meter;
        return foot;
    }
}
