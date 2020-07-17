import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        String fileName ="Y://SummerCourse//20.1.txt";

        File file = new File(fileName);//创建file对象

        PriorityQueue<String> result = new PriorityQueue<>();
        //StringBuilder result = new StringBuilder();//用来存储读写内容

        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(file)));
            String s;
            while((s = bufferedReader.readLine()) != null)
            {//readLine方法,一次读一行
                result.offer(System.lineSeparator() + s);
            }
            bufferedReader.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
