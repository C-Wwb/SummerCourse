public class linearSearch
{
    public static int lS(int key, int[] list)
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
