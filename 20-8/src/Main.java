import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> cities = Arrays.asList("Atlanta", "Savannah", "New York", "Dallas", "Beijing");
        cities.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        //cities.sort(String::compareToIgnoreCase);
        cities.forEach(e -> System.out.print(e + " "));
    }
}
