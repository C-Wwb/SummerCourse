

/**
 * @author wk
 * @date 2019/9/25  9:34
 */
public class Main {
    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 2; i < 100_000_000_0; i++)
        {
            if (i == pre(i) && test(i) )
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

    /**
     * �ж��Ƿ�������
     * @param n
     * @return
     */
    public static boolean test(int n)
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

    /**
     * �ж��Ƿ��ǻ�����
     * @param n
     * @return
     */
    public static Integer pre(int n)
    {
        int temp = 0;
        while (n > 0){
            temp = temp * 10+(n % 10);
            n = n / 10;
        }
        return temp;
    }
}
