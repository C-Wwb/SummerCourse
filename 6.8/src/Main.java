import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Celsius" + "\t\t" + "Fahrenheit" + "\t\t\t" + "Fahrenheit" + "\t\t" + "Celsius");
        DecimalFormat d = new DecimalFormat("0.0");
        DecimalFormat f = new DecimalFormat("0.00");
        for(int i = 1; i <= 10; i++)
        {
            System.out.print(d.format(41 - i) + "\t\t" + d.format(celsiusToFahrenheit(41 - i))
                    + "\t\t\t\t" + d.format((130 - i * 10)) + "\t\t\t" + f.format(fahrenheitToCelsius(130 - i * 10)));
            System.out.println();
        }
    }
    public static double celsiusToFahrenheit(double celsius)
    {
        double fahrenheit;
        fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        double celsius;
        celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
