public class binarySearch
{
    public static int bS(int[] numbers, int key)
    {//查找返回下标
        int low = 0;
        int high = numbers.length - 1;
        while(high >= low)
        {
            int mid = (low + high) / 2;
            if(key < numbers[mid])
                high = mid - 1;
            else if(key == numbers[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;
    }
}
