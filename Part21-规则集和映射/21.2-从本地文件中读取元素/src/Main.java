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
            System.out.println(print(file));
        }
        else
        {
            System.out.println("File " + filename + " does not exit");
        }
    }
    private static PriorityQueue<String> print(File file) throws Exception
    {
        PriorityQueue<String> result = new PriorityQueue<>();
        Scanner input = new Scanner(file);
        while (input.hasNext())
        {
            String word = input.next();
            result.add(word);
        }
        return result;
    }
}
