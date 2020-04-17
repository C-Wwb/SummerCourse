public class Main
{
    public static void main(String[] args)
    {
        printMax(1, 2, 65, 36.2, 8);
        double[] arr = {1, 2, 65, 36.2, 8};
        printMax(arr);
    }
    public static void printMax(double...numbers)
    {
        if(numbers.length == 0)
        {
            System.out.println("No argument passed");
        }
        else
        {
            double result = numbers[0];
            for(int i = 0; i < numbers.length; i++)
            {
                if(numbers[i] > result)
                {
                    result = numbers[i];
                }
            }
            System.out.println("The max value is: " + result);
        }
    }
}
