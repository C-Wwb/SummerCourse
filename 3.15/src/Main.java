import java.util.Scanner;

public class Main
{
    public  static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a three - digit integer:");
        int theInput = input.nextInt();
        int theWinningNumbers = (int)(Math.random() * 1000 + 100);
        int     inputHundreds = (theInput / 100),
                inputTen = theInput % 100 / 10,
                inputSingle = theInput % 100 % 10,
                WinningNumbersHundreds = theInput / 100,
                WinningNumbersTen = theInput % 100 / 10,
                WinningNumbersSingle = theInput % 100 % 10;
        System.out.println("The winning numbers is: " + theWinningNumbers);
        if(theInput == theWinningNumbers)
        {
            System.out.println("U win $10000");
        }
        else if((inputHundreds == WinningNumbersHundreds && inputTen == WinningNumbersTen && inputSingle == WinningNumbersSingle)
            ||(inputHundreds == WinningNumbersHundreds && inputTen == WinningNumbersSingle && inputSingle == WinningNumbersHundreds)
        ||(inputHundreds == WinningNumbersTen && inputTen == WinningNumbersHundreds && inputSingle == WinningNumbersSingle)
                || (inputHundreds == WinningNumbersTen && inputTen == WinningNumbersSingle && inputSingle == WinningNumbersHundreds)
        ||(inputHundreds == WinningNumbersSingle && inputTen == WinningNumbersHundreds && inputSingle == WinningNumbersTen)
        ||(inputHundreds == WinningNumbersSingle && inputTen == WinningNumbersTen && inputSingle == WinningNumbersHundreds))
        {
            System.out.println("U win $3000");
        }
        else if((inputHundreds == WinningNumbersHundreds) || (inputHundreds == WinningNumbersTen) || (inputHundreds == WinningNumbersSingle)
        || (inputTen == WinningNumbersHundreds) || (inputTen == WinningNumbersTen) || (inputTen == WinningNumbersSingle)
            || (inputSingle == WinningNumbersHundreds) || (inputSingle == WinningNumbersTen) || (inputSingle == WinningNumbersSingle))
        {
            System.out.println("U win $1000");
        }
        else
        {
            System.out.println("U lose");
        }
    }
}
