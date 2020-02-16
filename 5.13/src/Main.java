public class Main
{
    public static void main(String[] args)
    {
        int smallestInteger = 0;
        for(int n = 200; n > 0; n--)
        {
            if(Math.pow(n , 3) < 12000)
            {
                smallestInteger = n;
                break;
            }
        }
        System.out.println("The smallest integer is: " + smallestInteger);
    }
}
