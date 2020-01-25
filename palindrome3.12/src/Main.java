
    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            System.out.println("Please enter a number (input the number of digits in the palindrome:");
                    Scanner s = new Scanner(System.in);
            String string = s.next();
            int number = 0;// 记录比较次数
            if (string.length() % 2 != 0) {
                char[] ch = new char[string.length()];
                for (int i = 0; i < string.length(); i++) {
                    ch[i] = string.charAt(i);
                }
                for (int i = 0; i < ch.length / 2; i++) {
                    if (ch[i] == ch[ch.length - i - 1]) {
                        number++;
                    } else {
                        System.out.println("不是回文数");
                    }
                }
                if (number == string.length() / 2) {
                    System.out.println("回文数");
                }
            } else {
                System.out.println("输入错误");
            }
        }

    }
