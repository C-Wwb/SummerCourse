import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int LotteryNumber = (int)(Math.random() * 100 + 10);
        System.out.println("Please enter lottery pick(two digits):");
        int LotteryPick = input.nextInt();
        System.out.println("Please enter the lottery number: " + LotteryNumber);
        int  LotteryNumberUnitDigit = LotteryNumber % 10,
             LotteryNumberTenDigit = LotteryNumber / 10,

             LotteryPickUnitDigit =  LotteryPick % 10,
             LotteryPickTenDigit = LotteryPick / 10;
        if(LotteryPick == LotteryNumber)
        {
            System.out.println("Exact match: you win $10000");
        }
        else if((LotteryNumberTenDigit == LotteryPickTenDigit && LotteryNumberUnitDigit == LotteryPickUnitDigit)
        || (LotteryNumberTenDigit == LotteryPickUnitDigit && LotteryNumberUnitDigit == LotteryPickTenDigit))
        {
            System.out.println("Match all digits: you win $3000");
        }
        else if(LotteryNumberTenDigit == LotteryPickTenDigit || LotteryNumberUnitDigit == LotteryPickUnitDigit
        || LotteryNumberTenDigit == LotteryPickUnitDigit || LotteryNumberUnitDigit == LotteryPickTenDigit)
        {
            System.out.println("Match one digit: you win $1000");
        }
        else
        {
            System.out.println("Sorry: no match");
        }
    }
}
