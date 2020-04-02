public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        for(int i = 33; i <= 126; i++)
        {
            char ch = (char)i;
            System.out.print(ch + " ");
            count++;
            if(count % 10 == 0)
            {
                System.out.println();
            }
        }
    }
}
