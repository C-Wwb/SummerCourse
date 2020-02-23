public class Main
{
    public static void main(String[] args)
    {
        double num1 = Math.random() * 90 + 10;
        double num2 = Math.random() * 90 + 10;
        while(num1 == num2)
        {
            num2 = Math.random() * 90 + 10;
        }
        System.out.println("number 1 is: " + String.format("%.2f" , num1));
        System.out.println("number 2 is: " + String.format("%.2f" , num2));




    }
}
