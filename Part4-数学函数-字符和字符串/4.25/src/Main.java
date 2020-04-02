public class Main
{
    public static void main(String[] args)
    {
        String letter = "" + (char)((Math.random() * 25) + 65) + (char)((Math.random() * 25) + 65) + (char)((Math.random() * 25) + 65);
        int number = (int)(Math.random() * 8999) + 1000;
        System.out.println("License plate number is: " + letter + number);
    }
}
