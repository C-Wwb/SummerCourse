public class Main
{
    public static void main(String[] args)
    {
        final int NumberOfPrimes = 50;//打印50个数
        final int NumberOfPrimesPerLine = 8;//每行10个数
        int count = 0;//统计素数的个数
        int number = 2;//要被测试的数
        System.out.println("The first 50 prime numbers are \n");
        while(number <= 1000)
        {
            boolean isPrime = true;//判断这个数是否为素数
            for(int test = 2; test <= number / 2; test++)//测试数
            {
                if(number % test == 0)//如果能整除就不是素数
                {
                    isPrime = false;//则令isPrime = false
                    break;//并且跳出循环
                }
            }
            if(isPrime)
            {
                count++;
                if(count % NumberOfPrimesPerLine == 0)
                {
                    System.out.println(number);
                }
                else
                {
                    System.out.print(number + " ");
                }
            }
            number ++;
        }
    }
}
