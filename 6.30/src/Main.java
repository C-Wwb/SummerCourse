public class Main
{
    public static void main(String[] args)
    {
        int dice1 = (int)(Math.random() * 5 + 1);
        int dice2 = (int)(Math.random() * 5 + 1);
        int result = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + result);
        judgement(result);

    }
    public static void judgement(int result)
    {
        if(result == 2 || result == 3 || result == 12)
        {
            System.out.println("This is crap, You lose");
        }
        else if(result == 7 || result == 11)
        {
            System.out.println("This is natural, You win");
        }
        else
        {
            for(int i = 1; i < 100; i++)
            {
                int diceAdditional1 = (int)(Math.random() * 5 + 1);
                int diceAdditional2 = (int)(Math.random() * 5 + 1);
                int resultAdditional = diceAdditional1 + diceAdditional2;
                System.out.println("Point is " + result);
                System.out.println("You rolled " + diceAdditional1 + " + " + diceAdditional2 + " = " + resultAdditional);
                if(resultAdditional == 7)
                {
                    System.out.println("You lose");
                    break;
                }
                else if(resultAdditional == result)
                {
                    System.out.println("You win");
                    break;
                }
            }
        }
    }
}
