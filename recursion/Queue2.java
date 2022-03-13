package com.jl.recursion;

import java.util.Scanner;

/**
 * 2n皇后问题
 * @author jinlei
 * @time 2022年3月11日下午8:28:28
 */
public class Queue2 {
    
	static int count = 0;//记录总数
	static int max = 0; //棋盘大小
	static int[] white = null;//存放白皇后
	static int[] black = null;//存放黑皇后
	static int[][] arr = null;//棋盘初始化
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		max = sc.nextInt();
		white = new int[max];
		black = new int[max];
		arr = new int[max][max];
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		putWhite(0);
		System.out.println(count);
		
	}
	
	/**
	 * 放置白皇后
	 * @param n
	 */
	public static void putWhite(int n) {
		
		if(n == max) {//白皇后已放完
			putBlock(0);//开始放黑皇后
			return;
		}
		for (int i = 0; i < max; i++) {
			if(arr[n][i] == 1) {//判断此位置是否能放置皇后
				white[n] = i;//将第n个皇后放置到位置i（i列）
			}else {
				continue;//此位置不能放，结束本次循环，放置到下一列
			}
			if(judgeW(n)) {//检查冲突
				putWhite(n+1);//递归放下一个皇后
			}
		}
	}
	/**
	 * 放置黑皇后
	 * @param m
	 */
	public static void putBlock(int m) {
		
		if(m == max) {
			count++;
			return;
		}
		for (int i = 0; i < max; i++) {
			if(arr[m][i] == 1 && i != white[m]) {
				black[m] = i;
			}else {
				continue;
			}
			if(judgeB(m)) {
				putBlock(m+1);
			}
		}
	}
	
	/**
	 * 判断白皇后是否冲突
	 * @param n
	 * @return
	 */
	public static boolean judgeW(int n) {
		for (int i = 0; i < n; i++) {
			if(white[i] == white[n] || Math.abs(n-i) == Math.abs(white[n] - white[i])) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 判断黑皇后是否冲突
	 * @param m
	 * @return
	 */
	public static boolean judgeB(int m) {
		for (int i = 0; i < m; i++) {
			if(black[i] == black[m] || Math.abs(m-i) == Math.abs(black[m] - black[i])) {
				return false;
			}
		}
		return true;
	}
	
}
