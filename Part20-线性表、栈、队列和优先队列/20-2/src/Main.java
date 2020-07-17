import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        /*for (String s : collection) {
            System.out.println(s.toUpperCase() + " ");
        }*/
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next().toUpperCase() + " ");
        }

        int[] array = {1, 2, 3, 4, 5, 6};
        for (int value : array)
        {
            System.out.print(value + " ");
        }
    }
}
