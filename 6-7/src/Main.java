public class Main
{
    public static void main(String[] args)
    {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }
    public static void printPrimeNumbers(int numbers)
    {
        int count = 0;//ͳ�������ĸ���
        int number = 2;//Ҫ�����Ե���
        int newLine = 0;
        while(count < numbers)
        {
            boolean isPrime = true;//�ж�������Ƿ�Ϊ����
            for(int test = 2; test <= number / 2; test++)//������
            {
                if(number % test == 0)//����������Ͳ�������
                {
                    isPrime = false;//����isPrime = false
                    break;//��������ѭ��
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
