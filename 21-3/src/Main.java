import java.util.LinkedHashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Set<String> set = new LinkedHashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        set.forEach(e -> System.out.println(e.toLowerCase()));
    }
}
