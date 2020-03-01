public class Main
{
    public static void main(String[] args)
    {
        int optionedNumber = -1;
        int count = 0;
        System.out.println("The Numbers that are divisible by 5 and 6 are:");
        for(int number = 100; number <= 1000; number++)
        {

            if(number % 5 == 0 && number % 6 == 0)
            {
                optionedNumber = number;
                System.out.print(optionedNumber + " ");
                count++;
                if(count % 10 == 0)
                {
                    System.out.println("");
                }
            }
            else
            {
                continue;
            }

        }
    }
}
