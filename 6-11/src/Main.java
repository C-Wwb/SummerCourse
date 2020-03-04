public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        for(int i = 1; i <= 175; i++)
        {
            System.out.print(getRandomCharacter('a' , 'z'));
            count++;
            if(count % 25 == 0)
            {
                System.out.println();
            }
        }
    }
    public static char getRandomCharacter(char ch1, char ch2)//between ch1 and ch2
    {
        return (char)(Math.random() * (ch2 - ch1 + 1) + ch1);
    }
}
