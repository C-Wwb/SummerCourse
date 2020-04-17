public class Main
{
    public static void main(String[] args)
    {
        int sum = 0;
        int[] deck = new int[52];
        for(int i = 0; i < deck.length; i++)
        {
            deck[i] = i;
        }
        randomPick(deck);
        for(int i = 0; i < 4; i++)
        {
            System.out.println("Card number " + deck[i] + ": " + value(deck[i] % 13) + " of "
                    + suit(deck[i] / 13));
            sum += (deck[i] % 13 + 1);
        }
        System.out.println("Their sum is: " + sum);

    }
    public static int[] randomPick(int[] deck)
    {
        for(int i = 0; i < deck.length; i++)
        {//随机取牌
            int randomIndex = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        return deck;
    }
    public static String suit(int cardNumber)
    {
        if(cardNumber == 0)
        {
            return "spades";
        }
        else if(cardNumber == 1)
        {
            return "hearts";
        }
        else if(cardNumber == 2)
        {
            return "square";
        }
        else if(cardNumber == 3)
        {
            return "plum";
        }
        return  "";
    }
    public static String value(int cardNumber)
    {
        if(cardNumber == 0)
        {
            return "Ace";
        }
        else if(cardNumber == 1)
        {
            return "2";
        }
        else if(cardNumber == 2)
        {
            return "3";
        }
        else if(cardNumber == 3)
        {
            return "4";
        }
        else if(cardNumber == 4)
        {
            return "5";
        }
        else if(cardNumber == 5)
        {
            return "6";
        }
        else if(cardNumber == 6)
        {
            return "7";
        }
        else if(cardNumber == 7)
        {
            return "8";
        }
        else if(cardNumber == 8)
        {
            return "9";
        }
        else if(cardNumber == 9)
        {
            return "10";
        }
        else if(cardNumber == 10)
        {
            return "Jack";
        }
        else if(cardNumber == 11)
        {
            return "Queen";
        }
        else if(cardNumber == 12)
        {
            return "King";
        }
        return "";
    }
}
