import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Object[] array = {1, 2, 6, 8, 6, 7, 9, 2};
        array = ifRepeat2(array);
        System.out.println("The new array is: " + Arrays.toString(array));
    }
    public static Object[]  ifRepeat2(Object[] arr){
        //创建一个集合
        List list = new ArrayList();
        //遍历数组往集合里存元素
        for(int i=0;i<arr.length;i++){
            //如果集合里面没有相同的元素才往里存
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        //toArray()方法会返回一个包含集合所有元素的Object类型数组
        Object[] newArr = list.toArray();
        return newArr;
    }
}
