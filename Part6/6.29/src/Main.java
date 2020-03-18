public class Main
{
    public static void main(String[] args)
    {
        for(int i = 2; i <= 1000; i++)
        {
            if(testPrime(i) && testPrime((i + 2)))
            {
                System.out.println("( " + i + ", " + (i + 2) + " )");
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
