import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a hex digit:");
        String hex = input.next();
        if(hex.equalsIgnoreCase("0"))
        {
            System.out.println("The binary value is 0000");
        }
        else if(hex.equalsIgnoreCase("1"))
        {
            System.out.println("The binary value is 0001");
        }
        else if(hex.equalsIgnoreCase("2"))
        {
            System.out.println("The binary value is 0010");
        }
        else if(hex.equalsIgnoreCase("3"))
        {
            System.out.println("The binary value is 0011");
        }
        else if(hex.equalsIgnoreCase("4"))
        {
            System.out.println("The binary value is 0100");
        }
        else if(hex.equalsIgnoreCase("5"))
        {
            System.out.println("The binary value is 0101");
        }
        else if(hex.equalsIgnoreCase("6"))
        {
            System.out.println("The binary value is 0110");
        }
        else if(hex.equalsIgnoreCase("7"))
        {
            System.out.println("The binary value is 0111");
        }
        else if(hex.equalsIgnoreCase("8"))
        {
            System.out.println("The binary value is 1000");
        }
        else if(hex.equalsIgnoreCase("9"))
        {
            System.out.println("The binary value is 1001");
        }
        else if(hex.equalsIgnoreCase("A"))
        {
            System.out.println("The binary value is 1010");
        }
        else if(hex.equalsIgnoreCase("B"))
        {
            System.out.println("The binary value is 1011");
        }
        else if(hex.equalsIgnoreCase("C"))
        {
            System.out.println("The binary value is 1100");
        }
        else if(hex.equalsIgnoreCase("D"))
        {
            System.out.println("The binary value is 1101");
        }
        else if(hex.equalsIgnoreCase("E"))
        {
            System.out.println("The binary value is 1110");
        }
        else if(hex.equalsIgnoreCase("F"))
        {
            System.out.println("The binary value is 1111");
        }
        else
        {
            System.out.println(hex + " is an invalid input");
        }
    }
}
