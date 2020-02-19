public class Main
{
    public static void main(String[] args)
    {
        for(int line = 1; line <= 6; line++)
        {
            for(int spcae = 0; spcae < 6 - line; spcae++)
                System.out.print(" ");
            for(int number = line; number >= 1; number--)
                System.out.print(number);
            System.out.println();
        }
    }
}
