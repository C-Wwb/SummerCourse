import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = input.next();
        System.out.println(judge(string));

    }
    public static boolean judge(String string)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '(')
            {
                stack.push(string.charAt(i));
            }
            else if (string.charAt(i) == '}')
            {
                if(stack.peek() != '{')
                {
                    return false;
                }
                stack.pop();
            }
            else if (string.charAt(i) == ']')
            {
                if(stack.peek() != '[')
                {
                    return false;
                }
                stack.pop();
            }
            else if(string.charAt(i) == ')')
            {
                if(stack.peek() != '(')
                {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.size() == 0;
    }
}
/*
text
[d](){as}
 */