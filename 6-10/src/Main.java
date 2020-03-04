public class Main
{
    public static void main(String[] args)
    {
        System.out.println(getRandomCharacter('a' , 'z'));
    }
    public static char getRandomCharacter(char ch1, char ch2)//between ch1 and ch2
    {
        return (char)(Math.random() * (ch2 - ch1 + 1) + ch1);
    }
}
