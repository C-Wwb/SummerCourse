public class Main
{
    public static void main(String[] args)
    {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }
    public static void printPrimeNumbers(int numbers)
    {
        int count = 0;//统计素数的个数
        int number = 2;//要被测试的数
        int newLine = 0;
        while(count < numbers)
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

                if(count % numbers == 0)
                {
                    System.out.println(number);

                }
                else
                {
                    System.out.print(number + " ");
                }
                newLine++;
                if(newLine % 10 == 0)
                {
                    System.out.println();
                }
            }
            number ++;
        }
    }
}
