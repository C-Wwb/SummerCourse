public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        for(int i = 2; i > 0; i++)
        {
            if(testPrime(i) && i != testPalindrome(i) && testPrime(testReverse(i)))
            {
                count++;
                System.out.print(i + " ");
                if(count % 10 == 0)
                {
                    System.out.println();
                }
                if(count == 100)
                {
                    break;
                }
            }
        }
    }
    public static boolean testPrime(int n)//ÅĞ¶ÏËØÊı
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
    public static Integer testPalindrome(int n)//ÅĞ¶Ï»ØÎÄ
    {
        int temp = 0;
        while (n > 0){
            temp = temp * 10+(n % 10);
            n = n / 10;
        }
        return temp;
    }
    public static int testReverse(int n)//ÅĞ¶Ï·´
    {
        int s,j = 0;
        s = n;
        while (s != 0)
        {
            j = j * 10 + s % 10;
            s = s / 10;
        }
        return j;
    }
}
