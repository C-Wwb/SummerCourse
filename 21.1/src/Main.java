import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Set<String> set1 = new HashSet<>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        Set<String> set2 = new HashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

/*        set1.addAll(set2);
        System.out.println(set1); //并集
*/
        /*set1.removeAll(set2);
        System.out.println(set1);//差集
*//*
        set1.retainAll(set2);
        System.out.println(set1);//交集
*/
    }
}
