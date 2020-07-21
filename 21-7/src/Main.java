import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Java source file: ");
        String filename = input.nextLine();

        File file = new File(filename);
        if (file.exists())
        {
            System.out.println("The number of keywords in " + filename + " is " + countKeywords(file));
        }
        else
        {
            System.out.println("File " + filename + " does not exit");
        }
    }

    private static int countKeywords(File file) throws Exception
    {
        String[] keywordString = {"abstract", "assert", "boolean"};

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;

        Scanner input = new Scanner(file);

        while (input.hasNext())
        {
            String word = input.next();
            if (keywordSet.contains(word))
            {
                count++;
            }
        }
        return count;
    }

}
