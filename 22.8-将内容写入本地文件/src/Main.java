import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Java source file: ");
        String filename = input.nextLine();
        PrintStream ps = new PrintStream(filename);
        System.setOut(ps);
        System.out.println("My Word keep this");
    }
}
/*
Y:\SummerCourse\22.8.txt
 */