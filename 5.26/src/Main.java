import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double sum = 1;
        double e = 1.0;
        for(int i = 1; i <= n; i++) {
            sum /= i * 1.0;
            e += sum;
        }
        System.out.println(String.format("%.10f", e));

    }
}
