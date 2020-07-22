import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap: \n" + hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key: \n" + treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(/*16, 0.75f, true*/);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println("Display entries in LinkedHashMap: \n" + linkedHashMap);

        System.out.println("\nName and ages are: ");
        treeMap.forEach((name, age) -> System.out.print(name + ": " + age + " "));
    }
}
