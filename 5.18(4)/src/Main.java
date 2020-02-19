public class Main
{
    public static void main(String[] args)
    {
        for(int line = 1; line <= 6; line++)
        {
            for(int spcae = 0; spcae < line - 1; spcae++)
                System.out.print(" ");
            for(int number = 1; number <= 7 - line; number++)
                System.out.print(number);
            System.out.println();
        }
    }
}
