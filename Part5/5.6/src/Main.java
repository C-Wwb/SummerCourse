import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat d = new DecimalFormat("0.00");
        String output1 = "";
        String output2 = "";
        System.out.println("miles          kilometers");
        for(int miles1 = 1; miles1 <= 10; miles1++)
        {
            double kilometers1 = miles1 * 1.609;
            output1 = " " + d.format(miles1) + "          " + d.format(kilometers1) + "\n";
            System.out.print(output1);
        }
        System.out.println("kilometers          miles");
        for(int kilometers2 = 20; kilometers2 <= 65; kilometers2 += 5)
        {
            double miles2 = kilometers2 / 1.609;
            output2 = " " + d.format(kilometers2) + "          " + d.format(miles2) + "\n";
            System.out.print(output2);
        }
    }
}
