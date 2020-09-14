public class Main
{
    public static void main(String[] args)
    {
        int a = 2;
        System.out.println(a >> 1);//退一位
        System.out.println(a >> 2);//退两位
        System.out.println(a << 1);//进一位

        System.out.println(a >>> 1);//退一位，不保留符号，不能取负

        System.out.println(~ 11);//取反+1

        System.out.println(3 & 11);//3 : 0 0 1 1    11 : 1 0 1 1    预期 3
        //1 & 1 = 1 , 1 & 0 = 0 , 0 & 1 = 0 , 0 & 0 = 0

        System.out.println(3 | 9);//3 : 0 0 1 1    9 : 1 0 0 1    预期 1 0 1 1 : 11
        //1 | 1 = 1 , 1 | 0 = 1 , 0 | 1 = 1 , 0 | 0 = 0

        System.out.println(3 ^ 9);//3 : 0 0 1 1    9 : 1 0 0 1    预期 1 0 1 0 : 10
        //1 ^ 0 = 1 , 1 ^ 1 = 0 , 0 ^ 1 = 1 , 0 ^ 0 = 0
    }
}
