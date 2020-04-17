public class Main
{
    public static void main(String[] args)
    {
        System.out.println("The lowercase letters are: ");
        char[] character = new char[100];
        int count = 0;
        for(int i = 0; i < character.length; i++)
        {
            character[i] = getRandomCharacter('a', 'z');
            System.out.print(character[i] + " ");
            count++;
            if(count % 10 == 0)
            {
                System.out.println();
            }
        }
        System.out.println("The occurrences of each letter are: ");
        countsLetters(character);
    }
    public static char getRandomCharacter(char ch1, char ch2)//between ch1 and ch2
    {
        return (char)(Math.random() * (ch2 - ch1 + 1) + ch1);
    }
    public static void countsLetters(char[] character)
    {
        int[] counts = new int[26];
        int count = 0;
        for (char c : character)
        {
            counts[c - 97]++;
        }
        for(int i = 0; i < counts.length; i++)
        {
            System.out.print(counts[i] + " " + (char)(i + 97) + "\t\t");
            count++;
            if(count % 10 == 0)
            {
                System.out.println();
            }
        }
    }
}
