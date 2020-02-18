public class Main
{
    public static void main(String[] args)
    {
        for(int line = 1; line <= 6; line++)
        {
            for(int number = 1; number <= line; number++)
            {
                System.out.print(number);
                if(number == line)
                {
                    System.out.println();
                }
            }


        }
    }
}
