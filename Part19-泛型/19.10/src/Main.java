import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        System.out.println(max(arrayList));
    }
    public static <E extends Comparable<E>> E max(ArrayList<E> list)
    {
        return Collections.max(list);
    }
}
