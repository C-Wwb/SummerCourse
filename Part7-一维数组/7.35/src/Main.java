import java.util.Scanner;

public class Main
{
    /*public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = {"name", "program", "monopoly", "isolate", "provocative"};

        //int changeIndex = 0;//记录猜对的下标
        int missed = 0;
        for(int i = 0; i < 50; i++)
        {
            int number = (int)(Math.random() * 5 + 1);
            String guessed = words[number];//被猜的字符串
            int[] guessedWord = new int[guessed.length()];
            StringBuilder star = new StringBuilder();//*
            for(int inputStar = 0; inputStar < words[number].length(); inputStar++)
            {
                guessedWord[inputStar] = (int)(guessed.charAt(inputStar));
                star.append((int)("*"));
            }
            while (!star.toString().equals(guessed))
            {
                System.out.print("(Guess) Please enter a letter in word " + star + " > ");
                String inputWord = input.next();//输入一个要猜的数
                int iw = (int)inputWord.charAt(0);
                for(int j = 0; j < words[number].length(); j++)
                {
                    int gw = (int)guessed.charAt(j);
                    if(iw == gw)
                    {

                        break;
                    }
                }
            }
            System.out.print("The word is " + guessed);
            System.out.println("Do you want to guess another word? Please enter <y or n>");
            String option = input.next();
            if(option.equalsIgnoreCase("n"))
            {
                break;
            }
        }

    }*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {"life", "is", "simple", "you",
                "make", "choices", "and", "you",
                "do", "not", "look", "back"
        };

        char entrance = 'y';
        while(entrance == 'y') {
            int[] hashTable = new int[26];
            String answer = answerToTheRiddle(words);
            int lenth = answer.length();
            for(int i = 0; i < lenth; i++) {
                hashTable[answer.charAt(i) - 'a'] = 1;
            }

            int number = 0;
            int miss = 0;
            while(number != lenth) {
                System.out.print("(Guess) Enter a letter in word ");
                for(int i = 0; i < lenth; i++) {
                    if(hashTable[answer.charAt(i) - 'a'] == 2)
                        System.out.printf("%c", answer.charAt(i));
                    else
                        System.out.printf("*");
                }
                System.out.printf(">");
                String guess_string = input.next();
                char guess = guess_string.charAt(0);

                if(hashTable[guess - 'a'] == 0) {
                    System.out.printf("	%c is not in the word\n", guess);
                    miss++;
                }
                else if(hashTable[guess - 'a'] == 1) {
                    hashTable[guess - 'a'] = 2;
                    number++;
                }
                else
                    System.out.printf("	%c is already in the word\n", guess);
            }
            System.out.printf("The word is %s. You missed %d time\n", answer, miss);
            System.out.print("Do you want to guess another word? Enter y or n>");
            String entrance_string = input.next();
            entrance = entrance_string.charAt(0);
        };
        System.out.println("Let`s guess another word next time!");
    }

    public static String answerToTheRiddle(String[] words) {
        int index = (int)(Math.random() * 12);
        return words[index];
    }
}
