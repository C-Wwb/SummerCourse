import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input TheTotalAmount��");
        double TheTotalAmount = input.nextDouble();
        int     NumberOfCents = (int) (TheTotalAmount * 100),
                NumberOfDollars = NumberOfCents / 100,
                NumberOfCentsLeft1 = NumberOfCents % 100,
                NumberOfQuarter = NumberOfCentsLeft1 / 25,
                NumberOfCentsLeft2 = NumberOfCentsLeft1 % 25,
                NumberOfDime = NumberOfCentsLeft2 / 10,
                NumberOfCentsLeft3 = NumberOfCentsLeft2 % 10,
                NumberOfNickel = NumberOfCentsLeft3 / 5,
                NumberOfCentsLeft4 = NumberOfCentsLeft3 % 5,
                NumberOfPenny = NumberOfCentsLeft4;
        System.out.println("Your amout " + TheTotalAmount + " consists of:\n" + NumberOfDollars + " dollars\n"
                + NumberOfQuarter + " quarters\n" + NumberOfDime + "dimes\n" + NumberOfNickel + "nickels\n" +
                NumberOfPenny + "pennies");




    }
}
/*
��Ǯ�� TheTotalAmount
�ֱ��� NumberOfCents
��Ԫ�� NumberOfDollars
ʣ��ķֱ��� NumberOfCentsLeft
������ֵ���Ŀ NumberOfQuarter
�ǵ���Ŀ NumberOfDime
�����ֵ���Ŀ NumberOfNickel
һ���ֵ���Ŀ NumberOfPenny
 */