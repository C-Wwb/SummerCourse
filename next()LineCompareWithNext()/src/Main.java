import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter:");
        //String letter = input.nextLine();//ֻ�Իس�Ϊ���������Զ�ȡ�ո����ַ�
        String letter = input.next();//�Կո�Ϊ������ֻ��ȡ�ո�ǰ���ַ�;Ҳ�Իس�Ϊ����
        System.out.println(letter);
    }
}
