import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input TheTotalAmount：");
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
总钱数 TheTotalAmount
分币数 NumberOfCents
美元数 NumberOfDollars
剩余的分币数 NumberOfCentsLeft
两角五分的数目 NumberOfQuarter
角的数目 NumberOfDime
五美分的数目 NumberOfNickel
一美分的数目 NumberOfPenny
 */