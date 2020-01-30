public class Main
{
    public static void main(String[] args)
    {
        double  faceValue = (int)(Math.random() * 13),
                color = (int)(Math.random() * 4);
        System.out.println(displayFaceValue(faceValue) + displayColor(color));
    }
    static double displayFaceValue(double a)
    {
        if(a == 1)
        {
            System.out.print("The card u picked is Ace ");
        }
        else if(a == 2)
        {
            System.out.print("The card u picked is 2 ");
        }
        else if(a == 3)
        {
            System.out.print("The card u picked is 3 ");
        }
        else if(a == 4)
        {
            System.out.print("The card u picked is 4 ");
        }
        else if(a == 5)
        {
            System.out.print("The card u picked is 5 ");
        }
        else if(a == 6)
        {
            System.out.print("The card u picked is 6 ");
        }
        else if(a == 7)
        {
            System.out.print("The card u picked is 7 ");
        }
        else if(a == 8)
        {
            System.out.print("The card u picked is 8 ");
        }
        else if(a == 9)
        {
            System.out.print("The card u picked is 9 ");
        }
        else if(a == 10)
        {
            System.out.print("The card u picked is 10 ");
        }
        else if(a == 11)
        {
            System.out.print("The card u picked is Jack ");
        }
        else if(a == 12)
        {
            System.out.print("The card u picked is Queen ");
        }
        else if(a == 13)
        {
            System.out.print("The card u picked is King ");
        }
        return 0;
    }
    static double displayColor(double a)
    {
        if(a == 1)
        {
            System.out.println("of Clubs");
        }
        else if(a == 2)
        {
            System.out.println("of Diamonds");
        }
        else if(a == 3)
        {
            System.out.println("of Hearts");
        }
        else if(a == 2)
        {
            System.out.println("of Spades");
        }
        return 0;
    }
}
