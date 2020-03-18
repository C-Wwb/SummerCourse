public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        int uWin = 0;
        while(count <= 10000 )
        {
            count++;
            int dice1 = (int)(Math.random() * 5 + 1);
            int dice2 = (int)(Math.random() * 5 + 1);
            int result = dice1 + dice2;
            if(judgementTure(result))
            {
                uWin++;
            }
        }
        System.out.println("You win " + uWin + " times");
    }
    public static boolean judgementTure(int result)
    {
        if(result == 2 || result == 3 || result == 12)
        {
            return false;
        }
        else if(result == 7 || result == 11)
        {
            return true;
        }
        else
        {
            for(int i = 1; i < 100; i++)
            {
                int diceAdditional1 = (int)(Math.random() * 5 + 1);
                int diceAdditional2 = (int)(Math.random() * 5 + 1);
                int resultAdditional = diceAdditional1 + diceAdditional2;
                if(resultAdditional == 7)
                {
                    return false;
                }
                else if(resultAdditional == result)
                {
                    return true;
                }
            }
        }
        return true;
    }
}
