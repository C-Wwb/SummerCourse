import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = input.next();
        int i = 0;
        StringBuilder temp = new StringBuilder();
        List<StringBuilder> list = new ArrayList<>();
        //String[] result = new String[3];
        string += "0";
        while (i < string.length() - 1)
        {
            temp.append(string.charAt(i));
            if (string.charAt(i) > string.charAt(i + 1))
            {
                list.add(temp);
                temp = new StringBuilder();
            }
            i++;
        }
        int index = 0;
        int length = 0;
        for (int k = 0; k < list.size(); k++)
        {
            if (list.get(k).length() > length)
            {
                length = list.get(k).length();
                index = k;
            }
        }
        System.out.println(list.get(index));
    }
}
/*
text
abcabcdgabxy
abcabcdgabmnsxy
 */