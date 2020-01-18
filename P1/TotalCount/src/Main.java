import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input AnnualInterestRate(%):");
        double AnnualInterestRate = input.nextDouble();
        System.out.println("Please input NumberOfYear:");
        double NumberOfYear = input.nextDouble();
        System.out.println("Please input LoanCommitment:");
        double LoanCommitment = input.nextDouble();

        double MonthlyInterestRate = AnnualInterestRate / 100 / 12;
        double MonthlyPaymentLimit = (LoanCommitment * MonthlyInterestRate) / (1 - (1 / Math.pow((1 + MonthlyInterestRate),NumberOfYear * 12)));
        double TotalAmountOfPayment = MonthlyPaymentLimit * NumberOfYear * 12;

        System.out.println("The MonthlyPaymentLimit is: " + (int)MonthlyPaymentLimit);
        System.out.println("The TotalAmountOfPayment is: " + (int)TotalAmountOfPayment);

    }
}
/*
年利率 AnnualInterestRate
月利率 MonthlyInterestRate
年数 NumberOfYear
月支付额度 MonthlyPaymentLimit
总支付额度 TotalAmountOfPayment
贷款额度 LoanCommitment
 */
