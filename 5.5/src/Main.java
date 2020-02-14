import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("kilogram          pounds     pounds          kilogram");
        DecimalFormat d = new DecimalFormat("0.00");
        for(int kilogram1 = 1, pounds2 = 20 ; kilogram1 < 200 || pounds2 <= 515; kilogram1++, pounds2 += 5)
        {
            double pounds1 = kilogram1 * 2.2;
            double kilogram2 = pounds2 / 2.2;
            if(kilogram1 % 2 != 0 && pounds2 % 5 == 0)
            {
                System.out.print(d.format(kilogram1) + "              " + d.format(pounds1)
                        + "         " + pounds2 + "          " + d.format(kilogram2) + "\n");
            }
            else
            {
                continue;
            }
        }
    }
}
