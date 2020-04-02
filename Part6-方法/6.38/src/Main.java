public class Main
{
    public static void main(String[] args)
    {
        System.out.println("There are 100 lowercase letters: ");
        int count = 0;
        for(int i = 1; i <= 100; i++)
        {
            System.out.print(getRandomCharacter('a' , 'z') + " ");
            count++;
            if(count % 10 == 0)
            {
                System.out.println();
            }
        }
        System.out.println("There are 100 uppercase letters: ");
        for(int i = 1; i <= 100; i++)
        {
            System.out.print(getRandomCharacter('A' , 'Z') + " ");
            count++;
            if(count % 10 == 0)
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
