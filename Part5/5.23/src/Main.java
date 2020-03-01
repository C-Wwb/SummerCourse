public class Main
{
    public static void main(String[] args)
    {
        double result1 = 0;
        double result2 = 0;
        for(int i = 1; i <= 50000; i++)
        {
            result1 += 1.00 / i;
        }
        System.out.println(result1);
        for(int i = 50000; i >= 1; i--)
        {
            result2 += 1.00 / i;
        }
        System.out.println(result2);
    }
}
