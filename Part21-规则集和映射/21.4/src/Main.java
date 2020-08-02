import java.io.File;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Java source file: ");
        String filename = input.nextLine();

        File file = new File(filename);
        if (file.exists())
        {
            System.out.println(vowels(file));
        }
        else
        {
            System.out.println("File " + filename + " does not exit");
        }
    }
    private static int vowels(File file) throws Exception
    {
        StringBuilder temp = new StringBuilder();
        Scanner input = new Scanner(file);
        while (input.hasNext())
        {
            String word = input.next();
            word = word.toLowerCase();
            temp.append(word);
        }
        int vowels = 0;
        for (int i = 0; i < temp.length(); i++)
        {
            if (temp.charAt(i) == 'a' || temp.charAt(i) == 'e'
                    || temp.charAt(i) == 'i' || temp.charAt(i) == 'o' || temp.charAt(i) == 'u')
            {
                vowels++;
            }
        }
        return vowels;
    }
}
/*
Y:\SummerCourse\text.txt
 */