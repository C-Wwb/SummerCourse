import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(1);
        sort(list);
        System.out.println(list);
    }
    public static <E extends Comparable<E>> void sort(ArrayList<E> list)
    {
        Collections.sort(list);
    }
}
