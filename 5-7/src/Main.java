public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Multiplication Table");//表头
        System.out.print("   ");//横表头前空行
        for(int j = 1; j <= 9; j++)//打印横表头
        {
            System.out.print("   " + j);
        }
        System.out.println("\n---------------------------------------");//横表头下分割线
        for(int i = 1; i <= 9; i++)
        {
            System.out.print(i + " |");//打印纵表头
            for(int j = 1; j <= 9; j++)//嵌套循环
            {
                System.out.printf("%4d" , (i * j));//i，j相乘
            }
            System.out.println();//每行之后换行
        }
    }
}
/*
竖i
横j
 */