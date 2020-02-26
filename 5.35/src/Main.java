public class Main
{
    public static void main(String[] args)
    {
        double sum = 0;
        int num1 = 0;
        int num2 = 0;
        for(num1 = 1; num1 <= 624; num1++)
        {
            for(num2 = 2; num2 <= 625; num2++)
            {
                sum += 1 / (Math.sqrt(num1) + Math.sqrt(num2));
            }
        }
        System.out.println("The sum is " + String.format("%.2f" , sum));
    }
}
