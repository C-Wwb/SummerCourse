import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int count = 0;
        map.put("China", "Beijing");
        map.put("Japan", "Tokyo");
        map.put("SouthKorea", "Seoul");
        map.put("Thailand", "Bangkok");
        map.put("Belgium", "Brussels");
        map.put("Denmark", "Copenhagen");
        map.put("France", "Paris");
        for (String key : map.keySet())
        {
            System.out.println("What is the capital of " + key);
            String answer = input.next();
            if(answer.equalsIgnoreCase(map.get(key)))
            {
                System.out.println("Your answer is correct\n");
                count++;
            }
            else
            {
                System.out.println("The correct answer should be " + map.get(key));
            }
        }
        System.out.println("The correct count is " + count);
    }
}
