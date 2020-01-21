import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("There are four status:\n1 SingleTaxpayer\n2 MarriedCo-Taxpayer & EligibleWidowsAndWidowers" +
                "\n3  MarriedIndividualTaxpayer\n4 HouseholdHeadTaxpayer\nPlease enter ur status number:");
        int StatusNumber = input.nextInt();
        System.out.println("Please enter ur income:");
        double  income = input.nextDouble(),
                taxes = 0;
        DecimalFormat d = new DecimalFormat("0.00");
        if(StatusNumber == 1)
        {
            if(income < 0)
            {
                System.out.println("input error");
            }
            else if(income <= 8350 && income >= 0)
            {
                taxes = income * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 33950 && income >= 8351)
            {
                taxes = (income - 8350) * 0.15 + 8350 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 52250 && income >= 33951)
            {
                taxes = (income - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 171550 && income >= 82251)
            {
                taxes = (income - 52250) * 0.28 + (52250 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 372950 && income >= 171551)
            {
                taxes = (income - 171550) * 0.33 + (171550 - 82250) * 0.28 +
                        (52250 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income > 372951)
            {
                taxes = (income - 372950) * 0.35 + (372950 - 171550) * 0.33 +  (171550 - 82250) * 0.28 +
                        (52250 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
        }
        else if(StatusNumber == 2)
        {
            if(income < 0)
            {
                System.out.println("input error");
            }
            else if(income <= 16700 && income >= 0)
            {
                taxes = income * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 67900 && income >= 16701)
            {
                taxes = (income - 16700) * 0.15 + 16700 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 137050 && income >= 67901)
            {
                taxes = (income - 137050) * 0.25 + (67900 - 16700) * 0.15 + 16700 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 208850 && income >= 137051)
            {
                taxes = (income - 137050) * 0.28 + (137050 - 67900) * 0.25 + (67900 - 16700) * 0.15 + 16700 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 372950 && income >= 208851)
            {
                taxes = (income - 208850) * 0.33 + (208850 - 137050) * 0.28 +
                        (137050 - 67900) * 0.25 + (67900 - 16700) * 0.15 + 16700 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income > 372951)
            {
                taxes = (income - 372950) * 0.35 + (372950 - 208850) * 0.33 +  (208850 - 137050) * 0.28 +
                        (137050 - 67900) * 0.25 + (67900 - 16700) * 0.15 + 16700 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }

        }
        else if(StatusNumber == 3)
        {
            if(income < 0)
            {
                System.out.println("input error");
            }
            else if(income <= 8350 && income >= 0)
            {
                taxes = income * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 33950 && income >= 8351)
            {
                taxes = (income - 8350) * 0.15 + 8350 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 68525 && income >= 33951)
            {
                taxes = (income - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 104425 && income >= 68525)
            {
                taxes = (income - 68525) * 0.28 + (68525 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 186475 && income >= 104426)
            {
                taxes = (income - 104425) * 0.33 + (104425 - 68525) * 0.28 +
                        (68525 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income > 186476)
            {
                taxes = (income - 186475) * 0.35 + (186475 - 104425) * 0.33 +  (104425 - 68525) * 0.28 +
                        (68525 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
        }
        else if(StatusNumber == 4)
        {
            if(income < 0)
            {
                System.out.println("input error");
            }
            else if(income <= 11950 && income >= 0)
            {
                taxes = income * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 45500 && income >= 11951)
            {
                taxes = (income - 11950) * 0.15 + 11950 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 114750 && income >= 45501)
            {
                taxes = (income - 45500) * 0.25 + (45500 - 11950) * 0.15 + 11950 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 190200 && income >= 117451)
            {
                taxes = (income - 117450) * 0.28 + (117450 - 45500) * 0.25 + (45500 - 11950) * 0.15 + 11950 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income <= 372950 && income >= 190201)
            {
                taxes = (income - 190200) * 0.33 + (190200 - 117450) * 0.28 +
                        (117450 - 45500) * 0.25 + (45500 - 11950) * 0.15 + 11950 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
            else if(income > 372951)
            {
                taxes = (income - 372950) * 0.35 + (372950 - 190200) * 0.33 +  (190200 - 117450) * 0.28 +
                        (117450 - 45500) * 0.25 + (45500 - 11950) * 0.15 + 11950 * 0.1;
                System.out.println("The tax u have to pay is $" + d.format(taxes));
            }
        }
    }
}
