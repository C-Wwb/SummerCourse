import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        float sum = 0;
        for(float i = 0.01f; i <= 1.0f; i = i + 0.01f)
        {
            sum += i;
        }
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("The sum is " + d.format(sum));
    }
}
