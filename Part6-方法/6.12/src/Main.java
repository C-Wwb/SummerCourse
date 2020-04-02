import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter word1: ");
        String word1 = input.next();
        char ch1 = word1.charAt(0);

        System.out.println("Please enter word2: ");
        String word2 = input.next();
        char ch2 = word2.charAt(0);

        System.out.println("Please enter number of the per line: ");
        int numberPerLine = input.nextInt();

        printChars(ch1, ch2, numberPerLine);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine)
    {
        int count = 0;
        for(int i = ch1; i <= ch2; i++)
        {
            count++;
            System.out.print((char)i + " ");
            if(count % numberPerLine == 0)
            {
                System.out.println();
            }
        }
    }
}
