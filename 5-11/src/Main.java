import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {/*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        int decimal = input.nextInt();
        String hex = "";//����ʮ�����ƣ�������ĸ������
        while(decimal != 0)//��ʮ������������0������ѭ��
        {
            int h = decimal % 16;//��������Ϊʮ��������16����
            char hexDigit = (0 <= h && h <= 9) ? (char)(h + '0') : (char)(h - 10 + 'A');
            //����ʮ�������������������0-9֮�䣬�������֣����򣬷�����ĸ
            hex = hexDigit + hex;//ÿ��ѭ���Ľ���Ӻ�
            decimal = decimal / 16;//ÿִ����һ�Σ����̸�ֵ
        }
        System.out.println("The hex number is " + hex);
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        int decimal = input.nextInt();
        String hex = "";
        for(int i = 1; i > 0; i++)
        {
            int h = decimal % 16;
            char hexDigit = (0 <= h && h <= 9) ? (char)(h + '0') : (char)(h - 10 + 'A');
            hex = hexDigit + hex;
            decimal = decimal / 16;
            if(h == 0)
            {
                break;
            }
        }
        System.out.println("The hex number is " + hex);
    }

}
