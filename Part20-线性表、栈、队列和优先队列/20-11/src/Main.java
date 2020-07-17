import java.util.Collections;
import java.util.PriorityQueue;

public class Main
{
    public static void main(String[] args)
    {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.offer("Oklahoma");
        queue.add("Indiana");
        queue.offer("Georgia");
        queue.add("Texas");
        queue.offer("Beijing");
        queue.forEach(e -> System.out.println(e + " "));

        System.out.println();

        PriorityQueue<String> queue1 = new PriorityQueue<String>(5, Collections.reverseOrder());
        queue1.offer("Oklahoma");
        queue1.add("Indiana");
        queue1.offer("Georgia");
        queue1.add("Texas");
        queue1.offer("Beijing");
        queue1.forEach(e -> System.out.println(e + " "));
    }
}
