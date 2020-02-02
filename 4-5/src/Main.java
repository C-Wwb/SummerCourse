import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your lottery pick(two digits):");
        String lotteryPick = input.nextLine();
        String lotteryNumber =(int)(Math.random() * 10 + 10) + "";
        System.out.println("The lottery number is " + lotteryNumber);
        char   word1 = lotteryPick.charAt(0),
               word2 = lotteryPick.charAt(1),
               word3 = lotteryNumber.charAt(0),
               word4 = lotteryNumber.charAt(1);
        if(word1 == word3 && word2 == word4)
        {
            System.out.println("Exact match: you win $10,000");
        }
        else if(word1 == word4 && word2 == word3)
        {
            System.out.println("Exact match: you win $3,000");
        }
        else if((word1 == word3) || (word1 == word4) || (word2 == word3) || (word2 == word4))
        {
            System.out.println("Exact match: you win $1,000");
        }
        else
        {
            System.out.println("sorry no match");
        }
    }
}
