import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {/*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        int decimal = input.nextInt();
        String hex = "";//定义十六进制，包含字母和数字
        while(decimal != 0)//当十进制数不等于0，进入循环
        {
            int h = decimal % 16;//定义余数为十进制数对16求余
            char hexDigit = (0 <= h && h <= 9) ? (char)(h + '0') : (char)(h - 10 + 'A');
            //定义十六进制数，如果余数在0-9之间，返回数字；否则，返回字母
            hex = hexDigit + hex;//每个循环的结果加和
            decimal = decimal / 16;//每执行完一次，把商赋值
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
