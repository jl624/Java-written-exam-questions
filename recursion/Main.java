package com.jl.recursion;

import java.util.Scanner;

public class Main {

	static int count = 0;//存放有多少种方法
    static int[] white = null;//存放白皇后
    static int[] black = null;//存放黑皇后
    static int queens = 0;//棋盘大小
    static int[][] arr = null;//初始化棋盘

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        queens = scan.nextInt();
        white = new int[queens];
        black = new int[queens];
        arr = new int[queens][queens];
        //初始化棋盘
        for (int i = 0; i < queens; i++) {
            for (int j = 0; j < queens; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        scan.close();
        checkWhite(0);
        System.out.println(count);
    }

    /**
     * 放置白皇后
     *
     * @param n
     */
    private static void checkWhite(int n) {
        //先放置白皇后，当n=queens说明最后一个白皇后已经放置
        if (n == queens) {
            checkBlock(0);//白皇后放置完，则放置黑皇后
            return;
        }
        for (int i = 0; i < queens; i++) {
            if (arr[n][i] == 1) {//判断此位置是否可以放皇后，此位置为1说明可以放置
                white[n] = i;//将第n个皇后放置到位置i，i表示第i列
            } else {
                continue;//若此位置不能放置，则结束本次循环。即尝试放置到下一列
            }
            if (judgeW(n)) {//检验是否冲突
                checkWhite(n + 1);//不冲突则递归放置下一个皇后
            }
        }
    }

    /**
     * 放置黑皇后
     *
     * @param m
     */
    private static void checkBlock(int m) {
        if (m == queens) {//当m=queens表示黑皇后已经放置结束
            count++;
            return;
        }
        for (int i = 0; i < queens; i++) {
            if (arr[m][i] == 1 && i != white[m]) {//i！=white[m]表示此位置没有放置白皇后
                black[m] = i;
            } else {
                continue;
            }
            if (judgeB(m)) {
                checkBlock(m + 1);
            }
        }
    }


    /**
     * 判断白皇后是否冲突
     *
     * @param n 第n个皇后
     * @return
     */
    private static boolean judgeW(int n) {
        for (int i = 0; i < n; i++) {
            if (white[i] == white[n] || Math.abs(n - i) == Math.abs(white[n] - white[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断黑皇后是否冲突
     *
     * @param m
     * @return
     */
    private static boolean judgeB(int m) {
        for (int i = 0; i < m; i++) {
            if (black[i] == black[m] || Math.abs(m - i) == Math.abs(black[m] - black[i])) {
                return false;
            }
        }
        return true;
    }

}
