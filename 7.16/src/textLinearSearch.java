public class textLinearSearch
{
    public static void main(String[] args)
    {
        int[] numbers = new int[100000000];
        long startTimeLinearSearch = System.currentTimeMillis();
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = (int)(Math.random() * 100 + 1);
        }
        int key = (int)(Math.random() * 100 + 1);
        System.out.println("The key is: " + key);

        System.out.println(linearSearch.lS(key, numbers));
        long endTimeLinearSearch = System.currentTimeMillis();
        System.out.println("The binary search spend " + (endTimeLinearSearch - startTimeLinearSearch) + " s");
    }


}
