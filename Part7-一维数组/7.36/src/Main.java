public class Main
{
    // 皇后/棋盘的个数
    private static final int QUEEN_NUM = 8;

    // 首先定义一个8 * 8 的棋盘
    private static final int[][] Checkerboard = new int[QUEEN_NUM][QUEEN_NUM];

    // 定义一共有多少种放置皇后的算法
    private static int COUNT = 0;

    /**
     * 打印棋盘
     */
    public static void show() {
        System.out.println("第" + (++COUNT) + "次摆法");
        for (int i = 0; i < QUEEN_NUM; i++) {
            for (int j = 0; j < QUEEN_NUM; j++) {
                System.out.print(Checkerboard[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /**
     * 判断当前位置是否能放置皇后
     *
     * @param row
     *            行数
     * @param col
     *            列数
     * @return
     */
    public static boolean check(int row, int col) {

        // 判断当前位置的上面是否有皇后
        for (int i = row - 1; i >= 0; i--) {
            if (Checkerboard[i][col] == 1)
                return false;
        }

        // 判断左上是否有皇后
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (Checkerboard[i][j] == 1)
                return false;
        }

        // 判断右上是否有皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j < QUEEN_NUM; i--, j++) {
            if (Checkerboard[i][j] == 1)
                return false;
        }

        return true;
    }

    /**
     * 从第n行放置皇后
     *
     * @param row
     */
    public static void play(int row) {//从第0行开始
        // 遍历当前行的所有单元格 以列为单元
        for (int i = 0; i < QUEEN_NUM; i++) {
            // 是否能够放置皇后，遍历选定行的每一列
            if (check(row, i)) {
                Checkerboard[row][i] = 1;

                if (row == QUEEN_NUM - 1) {
                    // 最后行 放置完毕 打印皇后
                    show();
                } else {//如果当前选定行不是最后一行
                    // 放置下一行
                    play(row + 1);
                }
                //回退到当前步骤，把皇后设置为0
                Checkerboard[row][i] = 0;
                //所处行都不行时，和把皇后设置为1相对
                // 先让该位置等于1
                // 如果下一行遍历都不行，之前设置为1的该位置改为0
                // 在if外面是位置不行就设置为0，里面？？？
            }
        }
    }

    public static void main(String[] args) {
        play(0);
    }
}
