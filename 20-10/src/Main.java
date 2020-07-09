import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");
        //System.out.println(queue);
        //queue.forEach(e -> System.out.print(e + " "));
        while(queue.size() > 0)
        {
            //System.out.print(queue.remove() + " ");
            System.out.print(queue.poll() + " ");
        }
    }
}
