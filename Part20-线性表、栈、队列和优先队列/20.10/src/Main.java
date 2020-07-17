import java.util.PriorityQueue;

public class Main
{
    public static void main(String[] args)
    {
        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.add("George");
        queue1.add("Jim");
        queue1.add("John");
        queue1.add("Blake");
        queue1.add("Kevin");
        queue1.add("Michael");

        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.add("George");
        queue2.add("Katie");
        queue2.add("Kevin");
        queue2.add("George");
        queue2.add("Michelle");
        queue2.add("Ryan");

        PriorityQueue<String> queue3 = new PriorityQueue<String>();
        queue3.add("George");
        queue3.add("Jim");
        queue3.add("John");
        queue3.add("Blake");
        queue3.add("Kevin");
        queue3.add("Michael");

        PriorityQueue<String> queue4 = new PriorityQueue<String>();
        queue4.add("George");
        queue4.add("Katie");
        queue4.add("Kevin");
        queue4.add("George");
        queue4.add("Michelle");
        queue4.add("Ryan");

        PriorityQueue<String> queue5 = new PriorityQueue<String>();
        queue5.add("George");
        queue5.add("Jim");
        queue5.add("John");
        queue5.add("Blake");
        queue5.add("Kevin");
        queue5.add("Michael");

        PriorityQueue<String> queue6 = new PriorityQueue<String>();
        queue6.add("George");
        queue6.add("Katie");
        queue6.add("Kevin");
        queue6.add("George");
        queue6.add("Michelle");
        queue6.add("Ryan");

        queue1.retainAll(queue2);
        System.out.println("Intersection is: " + queue1);

        queue3.removeAll(queue4);
        System.out.println("Difference set is: " + queue3);

        queue5.removeAll(queue6);
        queue5.addAll(queue6);
        System.out.println("And set is: " + queue5);
    }
}
