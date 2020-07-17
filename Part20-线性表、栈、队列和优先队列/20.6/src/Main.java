import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List<Double> list = new ArrayList<>(5000000);
        for (int i = 0; i < 5000000; i++)
        {
            list.add((double) i);
        }
        long startTime = System.currentTimeMillis();
        List<Double> target = new ArrayList<>(5000000);
        /*Iterator<Double> iterator = list.iterator();
        while (iterator.hasNext())
        {
            target.add(iterator.next());
        }*/
        for (int i = 0; i < 5000000; i++)
        {
            target.add(list.get(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("The project waste " + (endTime - startTime) + " times");
    }
}
