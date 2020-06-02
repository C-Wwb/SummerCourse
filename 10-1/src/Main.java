import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Loan loan = new Loan();
        loan.setAnnualInterestRate(2.5);
        loan.setNumberOfYears(5);
        loan.setLoanAmount(1000);
        System.out.println(loan.getMonthlyPayment() + "\n" + loan.getTotalPayment()
                + "\n" + loan.getLoanDate());
    }
}
class Loan
{
    private double annualInterestRate;//贷款年利率
    private int numberOfYears;//贷款年数
    private double loanAmount;//贷款额
    private java.util.Date loanDate;//创建贷款的日期
    public Loan()
    {
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 100;
    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
    {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public double getMonthlyPayment()
    {
        double monthlyInterestRate = this.annualInterestRate / 1200;
        return this.loanAmount * monthlyInterestRate
                / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }
    public double getTotalPayment()
    {
        return getMonthlyPayment() * this.numberOfYears * 12;
    }
}
