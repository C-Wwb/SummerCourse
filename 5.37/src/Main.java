import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*int num = 10;
        System.out.println(Integer.toBinaryString(num));//ת��Ϊ������
        System.out.println(Integer.toHexString(num));//ת��Ϊʮ������
        System.out.println(Integer.toOctalString(num));//ת��Ϊ�˽���*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        int decimal = input.nextInt();
        int[] remainder = new int[100];
        ArrayList<Integer> binary = new ArrayList<Integer>();
        for(int i = 1; i <= 4; i++)
        {
            remainder[i] = decimal % 2;
            decimal /= 2;
        }
        for(int j = 4; j >= 1; j--)
        {
            binary.add(remainder[j]);
        }
        System.out.println(binary);
    }
}
