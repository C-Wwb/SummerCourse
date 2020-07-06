import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(0, 100);
        System.out.println(list);

        Collection<Integer> collection = new ArrayList<Integer>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        list.addAll(2, collection);
        System.out.println(list);

        list.set(0, 150);
        System.out.println(list);

        System.out.println(list.indexOf(5));
        System.out.println(list.lastIndexOf(5));
        System.out.println(list.subList(2, 10));

        ListIterator<Integer> list1 = list.listIterator();
        

    }
}
