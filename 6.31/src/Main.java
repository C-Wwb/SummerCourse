import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a credit card number as String: ");
        String creditCardNumber = input.next();
        isValid(creditCardNumber);
    }
    public static void isValid(String idNumber)
    {
        int evenSum1 = 0;
        int evenSum2 = 0;
        int evenSum = 0;
        int singularSum = 0;
        int totalSum = 0;
        int count = 0;
        if(idNumber.length() >= 13 && idNumber.length() <= 16)
        {
            for(int i = 0; i < idNumber.length(); i++)
            {
                count++;
                int digital = idNumber.charAt(i) - '0';
                if(i % 2 == 0)
                {
                    digital *= 2;
                    if(digital < 10)
                    {
                        evenSum1 += digital;
                        digital = 0;
                    }
                    else
                    {
                        digital = digital / 10 + digital % 10;
                        evenSum2 += digital;
                        digital = 0;
                    }
                    evenSum = evenSum1 + evenSum2;
                }
                else
                {
                    singularSum += digital;
                }
                if(count == (idNumber.length() + 1))
                {
                    break;
                }
            }
            totalSum = evenSum + singularSum;
            if(totalSum % 10 == 0)
            {
                System.out.println(idNumber + " is valid");
            }
            else
            {
                System.out.println(idNumber + " is invalid");
            }
        }
        else
        {
            System.out.println(idNumber + " is invalid");
        }

    }
}
