public class Main
{
    public static void main(String[] args)
    {
        int space;
        int leftNumber;
        int rightNumber;
        for(int line = 1; line <= 8; line++)
        {
            for(space = 1; space <= 8 - line; space++)
                System.out.print("  ");
            for(leftNumber = 1; leftNumber <= (int)(Math.pow(2 , (line - 1))); leftNumber *= 2)
                System.out.print(leftNumber + " ");
            for(rightNumber = (int) Math.pow(2 , (line - 2) ); rightNumber >= 1; rightNumber /= 2)
                System.out.print(rightNumber + " ");
                System.out.println();
        }
    }
}
