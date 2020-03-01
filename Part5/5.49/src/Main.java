import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = input.nextLine();
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < string.length(); i++)
        {
            char ch = string.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U')
            {
                vowels++;
            }
            else if(ch == ' ')
            {
                continue;
            }
            else
            {
                consonants++;
            }
        }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
