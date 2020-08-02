import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set: " + treeSet);

        System.out.println("first: " + treeSet.first()/*返回集合的第一个元素*/);
        System.out.println("last: " + treeSet.last()/*返回集合的最后一个元素*/);

        System.out.println("headSet(\"New York\"): "
                + treeSet.headSet("New York")/*返回集合中小于指定元素的部分*/);
        System.out.println("tailSet(\"New York\"): "
                + treeSet.tailSet("New York")/*返回集合中大于等于指定元素的部分*/);

        System.out.println("lower: " + treeSet.lower("P")/*返回集合中小于该元素的元素*/);
        System.out.println("floor: " + treeSet.floor("P")/*返回集合中小于等于该元素的元素*/);
        System.out.println("ceiling: " + treeSet.ceiling("P")/*返回集合中大于等于该元素的元素*/);
        System.out.println("higher: " + treeSet.higher("P")/*返回集合中大于该元素的元素*/);

        System.out.println("poolFirst: " + treeSet.pollFirst()/*删除并返回集合中的第一个元素*/);
        System.out.println("poolLast: " + treeSet.pollLast()/*删除并返回集合中的最后一个元素*/);

        System.out.println(treeSet);
    }
}
