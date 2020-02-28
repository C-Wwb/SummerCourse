public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        /*for(int i = 1; i < 100; i++)
        {
            int number1 = (int)(Math.random() * 6 + 1);
            int number2 = (int)(Math.random() * 6 + 1);
            String combination = number1 + " " + number2;
            if(number1 < number2)
            {
                System.out.println(combination);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);*/
        for(int number1 = 1; number1 <= 7; number1++)
        {
            for(int number2 = 2; number2 <= 7; number2++)
            {
                String combination = number1 + " " + number2;
                if(number1 < number2)
                {
                    System.out.println(combination);
                    count++;
                }
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}
