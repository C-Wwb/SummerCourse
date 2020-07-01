import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(removeDuplicates(list));
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
        ArrayList<E> result = new ArrayList<E>();
        int index = 0;
        while(index < list.size() - 1)
        {
            for(int i = index + 1; i < list.size(); i++)
            {
                if(list.get(index) == list.get(i))
                {
                    result.add(list.get(index));
                    break;
                }
            }
            index++;
        }
        return result;
    }
}
