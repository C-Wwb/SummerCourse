import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Set<String> set1 = new HashSet<>();
        set1.add("London");
        set1.add("Paris");
        set1.add("San Francisco");
        set1.add("New York");
        set1.add("Beijing");
        System.out.println("set1 is: " + set1);
        System.out.println(set1.size() + " elements in set1");

        System.out.println();

        set1.remove("London");
        System.out.println("set1 is: " + set1);
        System.out.println(set1.size() + " elements in set1");

        Set<String> set2 = new HashSet<>();
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");

        System.out.println();

        System.out.println("set1 is: " + set2);
        System.out.println(set2.size() + " elements in set2");

        System.out.println("Is Taipei in set2? " + set2.contains("Taipei"));

        System.out.println();

        set1.addAll(set2);
        System.out.println("After adding set2 to set1, set1 is: " + set1);

        System.out.println();

        set1.removeAll(set2);
        System.out.println("After removing set2 from set1, set1 is: " + set1);

        System.out.println();

        set1.retainAll(set2);
        System.out.println("After retaining common elements in set2 and set2, set1 is " + set1);
    }
}
