import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int magicNumber = (int)(Math.random() * 101);
        System.out.print("Guess a magic number between 0 and 100");
        int guess = -1;
        while(guess != magicNumber)
            /*��guess������magicNumber��ʱ�����ѭ������ʼ��guess=-1��ֱ�ӽ���ѭ����һ��guess����
            magicNumber������ѭ��*/
        {
           System.out.println("\nEnter your guess:");
           guess = input.nextInt();
           if(guess == magicNumber)
           {
               System.out.print("\nYes, the number is " + magicNumber);
           }
           else if(guess < magicNumber)
           {
               System.out.print("\nYour guess is to low");
           }
           else
           {
               System.out.print("\nYour guess is to high");
           }
        }

    }
}
