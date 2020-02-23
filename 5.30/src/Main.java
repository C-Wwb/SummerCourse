import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the total amount: ");
        double totalAmount = input.nextDouble();
        System.out.println("Please enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterstRate = annualInterestRate / 100 / 12;
        System.out.println("Please enter the month: ");
        int month = input.nextInt();
        double amount = 0;
        for(int i = 1; i <= month; i++)
        {
            amount = (amount + totalAmount) * (1 + monthlyInterstRate);
        }
        System.out.println("A " + month + " month later u have " + String.format("%.2f", amount)
                + " in ur account");
    }
}
