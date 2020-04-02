import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        int year = 0;
        double tuition = 10000;
        for(int i = 1; i > 0; i++)
        {
            tuition *= 1.07;
            if(tuition > 20000)
            {
                year = i;
                break;
            }
        }
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("Tuition will be doubled in " + d.format(year));
        System.out.println("Tuition will be $" + d.format(tuition) + " in " + d.format(year) + " years");
    }
}
