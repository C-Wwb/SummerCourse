import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*int num = 10;
        System.out.println(Integer.toBinaryString(num));//转化为二进制
        System.out.println(Integer.toHexString(num));//转化为十六进制
        System.out.println(Integer.toOctalString(num));//转化为八进制*/
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
