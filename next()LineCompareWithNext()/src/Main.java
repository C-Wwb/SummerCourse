import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter:");
        //String letter = input.nextLine();//只以回车为结束，可以读取空格后的字符
        String letter = input.next();//以空格为结束，只读取空格前的字符;也以回车为结束
        System.out.println(letter);
    }
}
