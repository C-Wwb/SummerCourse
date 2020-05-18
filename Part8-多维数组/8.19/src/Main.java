import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[6][7];
        System.out.println("Please enter the array: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println(judge(array));
    }

    public static boolean judge(int[][] array) {
        //row
        int count;
        for (int i = 0; i < array.length; i++) {
            count = 1;
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] == array[i][j - 1])
                    count++;
                else
                    count = 1;
                if (count == 4)
                    return true;
            }
        }
        return false;
    }
}
/*
0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 6 2 1 8 2 9
6 5 6 1 1 9 1
1 3 6 1 4 0 7
3 3 3 3 4 0 7

0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 5 2 1 8 2 9
6 5 6 1 1 9 1
1 5 6 1 4 0 7
3 5 3 3 4 0 7

0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 6 2 1 6 2 9
6 5 6 6 1 9 1
1 3 6 1 4 0 7
3 6 3 3 4 0 7

0 1 0 3 1 6 1
0 1 6 8 6 0 1
9 6 2 1 8 2 9
6 9 6 1 1 9 1
1 3 9 1 4 0 7
3 5 3 9 4 0 7
 */
