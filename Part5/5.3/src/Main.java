import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("kilogram          pounds");
        DecimalFormat d = new DecimalFormat("0.00");
        for(int kilogram = 1; kilogram < 200; kilogram++)
        {
            double pounds = kilogram * 2.2;
            if(kilogram % 2 != 0)
            {
                System.out.print(d.format(kilogram) + "              " + d.format(pounds) + "\n");
            }
            else
            {
                continue;
            }
        }
    }
}
