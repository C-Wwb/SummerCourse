import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("red");
        collection1.add("yellow");
        collection1.add("red");

        List<String> collection2 = new ArrayList<>();
        collection2.add("blue");
        collection2.add("pink");
        collection2.add("green");

        System.out.println(Collections.disjoint(collection1, collection2));//没有共同元素返回true
        System.out.println(Collections.frequency(collection1, "red"));//集合中某元素出现的次数
        Collections.reverse(collection2);
        System.out.println(collection2);
    }
}
