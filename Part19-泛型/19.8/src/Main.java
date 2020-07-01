import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(1);
        shuffle(list);
        System.out.println(list);
    }
    public static <E> void shuffle(ArrayList<E> list)
    {
        Collections.shuffle(list);
    }
}
