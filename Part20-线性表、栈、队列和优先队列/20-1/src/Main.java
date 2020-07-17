import java.util.ArrayList;
import java.util.Collection;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("New York");
        arrayList.add("Atlanta");
        arrayList.add("Dallas");
        arrayList.add("Madison");

        System.out.println("A list of cities in arrayList: " + arrayList);
        System.out.println("Is Dallas in arrayList ? " + arrayList.contains("Dallas"));

        arrayList.remove("Dallas");
        System.out.println(arrayList.size() + " cities are in arrayList now");


        Collection<String> collection = new ArrayList<>();
        collection.add("Seattle");
        collection.add("Portland");
        collection.add("Los Angeles");
        collection.add("Atlanta");

        System.out.println("A list of cities in collection is: " + collection);

        ArrayList<String> arrayList1 = (ArrayList<String>) arrayList.clone();
        arrayList1.addAll(collection);
        System.out.println("Cities in arrayList or collection is: " + arrayList1);

        arrayList1 = (ArrayList<String>) arrayList.clone();
        arrayList1.retainAll(collection);
        System.out.println("Cities in arrayList and collection is: " + arrayList1);

        arrayList1 = (ArrayList<String>) arrayList.clone();
        arrayList1.removeAll(collection);
        System.out.println("Cities in arrayList but not in collection is: " + arrayList1);
    }
}
