public class Main
{
    public static void main(String[] args)
    {
        final int NumberOfPrimes = 50;//��ӡ50����
        final int NumberOfPrimesPerLine = 8;//ÿ��10����
        int count = 0;//ͳ�������ĸ���
        int number = 2;//Ҫ�����Ե���
        System.out.println("The first 50 prime numbers are \n");
        while(number <= 1000)
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
