import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the initial deposit amount: ");
        double amount = input.nextDouble();
        System.out.println("Please enter annual percentage yield: ");
        double annualYield = input.nextDouble();
        double monthlyYield = annualYield / 100 / 12;
        System.out.println("Please enter maturity period (number of months): ");
        int month = input.nextInt();
        System.out.println("Month   CD Value");
        for(int i = 1; i <= month; i++)
        {
            amount *= (1 + monthlyYield);
            System.out.println(i + "\t\t" + String.format("%.2f" , amount));
        }

    }
}
