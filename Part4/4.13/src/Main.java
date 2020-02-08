import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter:");
        String letter = input.next();
        char ch = letter.charAt(0);
        if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e")
        || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o")
        || letter.equalsIgnoreCase("u"))
        {
            System.out.println(letter.toUpperCase() + " is a vowel");
        }
        else if(Character.isLetter(ch))
        {
            System.out.println(letter.toUpperCase() + " is a consonant");
        }
        else
        {
            System.out.println(letter + " is an invalid input");
        }
    }
}
