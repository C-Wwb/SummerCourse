public class textBinarySearch
{
    public static void main(String[] args)
    {

        long startTimeBinarySearch = System.currentTimeMillis();
        int[] numbers = new int[100000000];
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = (int)(Math.random() * 100 + 1);
        }
        int key = (int)(Math.random() * 100 + 1);
        System.out.println("The key is: " + key);

        System.out.println(binarySearch.bS(numbers, key));
        long endTimeBinarySearch = System.currentTimeMillis();
        System.out.println("The binary search spend " + (endTimeBinarySearch - startTimeBinarySearch) + " s");
    }
}
