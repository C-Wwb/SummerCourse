import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        //int[] nums = {2, 3, 40, 3, 5, 4, -3, 3, 3, 2, 0};
        int[] nums = {9, 30, 3, 9, 3, 2, 4};
        Map<Integer, Integer> result = new HashMap<>();
        for (int e : nums)
        {
            int count = result.getOrDefault(e, 0) + 1;
            result.put(e, count);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : result.entrySet())
        {
            if (entry.getValue() > max)
            {
                max = entry.getValue();
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet())
        {
            if (entry.getValue() == max)
            {
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
    }
}
