public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Multiplication Table");//��ͷ
        System.out.print("   ");//���ͷǰ����
        for(int j = 1; j <= 9; j++)//��ӡ���ͷ
        {
            System.out.print("   " + j);
        }
        System.out.println("\n---------------------------------------");//���ͷ�·ָ���
        for(int i = 1; i <= 9; i++)
        {
            System.out.print(i + " |");//��ӡ�ݱ�ͷ
            for(int j = 1; j <= 9; j++)//Ƕ��ѭ��
            {
                System.out.printf("%4d" , (i * j));//i��j���
            }
            System.out.println();//ÿ��֮����
        }
    }
}
/*
��i
��j
 */