import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int sum = 0;
        int average = 0;
        System.out.println("Please enter an integer, the input ends if it is 0:");
        int a[] = new int[100];
        for(int i = 0; i < 100; i++)
        {
            a[i] = input.nextInt();
            if(a[i] == 0)
            {
                break;
            }
            else
            {
                if(a[i] > 0)
                {
                    positive++;
                }
                else if(a[i] < 0)
                {
                    negative++;
                }
            }
            sum += a[i];
            average = sum / (positive + negative);
        }
        /*
        String integer = input.nextLine();
        for(int i = 0; i < integer.length(); i++)
        {
            char ch = integer.charAt(i);
            if(ch == 0)
            {
                break;
            }
            else
            {
                if(ch > '0' && ch <= '9')
                {
                    positive++;
                }
                else
                {
                    negative++;
                }
            }
            sum += (int)ch - 48;
            average = sum / (integer.length() - 1);
        }*/
        System.out.println("The number of positives is: " + positive);
        System.out.println("The number of negative is: " + negative);
        System.out.println("The total is: " + sum);
        System.out.println("The average is: " + average);

    }
}
