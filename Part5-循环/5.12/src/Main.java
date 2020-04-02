public class Main
{
    public static void main(String[] args)
    {
        int smallestInteger = 0;
        for(int n = 1; n > 0; n++)
        {
            if(n > Math.abs(Math.sqrt(12000)))
            {
               smallestInteger = n;
               break;
            }
        }
        System.out.println("The smallest integer is: " + smallestInteger);
    }
}
