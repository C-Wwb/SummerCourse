import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String matrix1 = "1 3 5 7\n" + "9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31",
               matrix2 = "2 3 6 7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31",
               matrix3 = "4 5 6 7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31",
               matrix4 = "8 9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31",
               matrix5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31";
        int day = 0;
        System.out.println("Is your birthday in matrix1?\n" + matrix1 + "\nPlease enter 0 for No and 1 for Yes:");
        int answer1 = input.nextInt();
        if(answer1 == 1)
        {
            day += 1;
        }
        System.out.println("Is your birthday in matrix2?\n" + matrix2 + "\nPlease enter 0 for No and 1 for Yes:");
        int answer2 = input.nextInt();
        if(answer2 == 1)
        {
            day += 2;
        }
        System.out.println("Is your birthday in matrix2?\n" + matrix3 + "\nPlease enter 0 for No and 1 for Yes:");
        int answer3 = input.nextInt();
        if(answer3 == 1)
        {
            day += 4;
        }
        System.out.println("Is your birthday in matrix2?\n" + matrix4 + "\nPlease enter 0 for No and 1 for Yes:");
        int answer4 = input.nextInt();
        if(answer4 == 1)
        {
            day += 8;
        }
        System.out.println("Is your birthday in matrix2?\n" + matrix5 + "\nPlease enter 0 for No and 1 for Yes:");
        int answer5 = input.nextInt();
        if(answer5 == 1)
        {
            day += 16;
        }
        System.out.println("Your birthday is " + day + " !");
    }
}
