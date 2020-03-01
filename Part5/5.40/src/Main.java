public class Main
{
    public static void main(String[] args)
    {
        /*int coinSide = (int)(Math.random() * 2);//²»°üÀ¨2
        System.out.println(coinSide);*/
        int count = 0;
        for(int i = 1; i <= 100; i++)
        {
            int coinSide = (int)(Math.random() * 2);
            System.out.print(i + " " + transformSide(coinSide) + " ");
            count++;
            if(count % 10 == 0)
            {
                System.out.println();
            }
        }

    }

    private static String transformSide(int num)
    {
        if(num == 0)
        {
            return "flowers";
        }
        else  if(num == 1)
        {
            return "heads";
        }
        return "";
    }
}
