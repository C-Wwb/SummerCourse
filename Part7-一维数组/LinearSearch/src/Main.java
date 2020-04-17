public class Main
{
    public static int linearSearch(int key, int[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            if(key == list[i])
            {
                return 1;
            }
        }
        return -1;
    }
}
