import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char word = (char)((int)((Math.random() * 25) + 65));
        System.out.println("The word is " + word);
    }
}
