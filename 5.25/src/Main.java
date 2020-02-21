public class Main
{
    public static void main(String[] args)
    {
        double result = 0;
        for(int i = 10000; i <= 100000; i += 10000)
        {
            result += Math.pow((-1) , i + 1) / ((2 * i) - 1);
            System.out.println(result * 4);
        }
    }
}
