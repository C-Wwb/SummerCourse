import java.util.ArrayList;
import java.util.Collection;

public class Main
{
    public static void main(String[] args)
    {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        collection.forEach(element -> System.out.println(element.toUpperCase() + " "));
    }
}
