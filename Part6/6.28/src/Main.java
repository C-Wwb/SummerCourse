import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("p\t\t2^p-1");
        DecimalFormat d = new DecimalFormat("0");
        for(int i = 2; i <= 31; i++)
        {
            if(testPrime(i))
            {
                System.out.println(i + "\t\t" + d.format(Math.pow(2 , i) - 1));
            }
        }
    }
    public static boolean testPrime(int n)//ÅÐ¶ÏËØÊý
    {
        if (n < 2)
        {
            return false;
        }
        int z = (int)Math.sqrt(n);
        for (int i = 2; i <= z; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
