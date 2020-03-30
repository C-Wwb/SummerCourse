public class Main
{
    public static void main(String[] args)
    {
        int[] number = new int[100];
        double[] count = new double[101];
        for(int i = 0; i < 100; i++)
        {
            number[i] = (int)(Math.random() * 100 + 1);
            count[number[i]]++;
        }
        java.util.Arrays.sort(number);
        number = changeMethodOne(number);
        for(int i = 0; i < number.length; i++)
        {
            if(number[i] == 0)
            {
                continue;
            }
            else
            {
                System.out.println(number[i] + " occurs " + count[number[i]] + " times");
            }
        }
    }
    public static int[] changeMethodOne(int[] src){//方法一  去掉重复数字
        int length = src.length;//获得传入数组的长度
        int[] taget = new int[length];//声明一个数组，长度为传入数组的长度
        int index = 0;
        taget[0] = src[0];//设置数组的初始值
        for (int i = 1; i < length; i++) {//循环遍历传入数组
            if (taget[index] != src[i]){//遍历数组与初始值进行比较
                index++;//等价于index=index+1
                taget[index] = src[i];//元素赋值
            }
        }
        return taget;//返回结果数组
    }
}
