package com.jl.recursion;

import java.util.Queue;

/**
 * 八皇后问题
 * @author jinlei
 * @time 2022年3月11日下午2:59:26
 */
public class Queue8 {
	
	//定义一个max表示共有几个皇后
	int max = 8;
	//定义一个array，保存皇后放置位置的结果，如array=  {0，4，7，5，2，6，1，3}
	int[] array = new int[max];
	
	static int count = 0;

	public static void main(String[] args) {
		
		//测试
		Queue8 queue8 = new Queue8();
		queue8.check(0);
		System.out.printf("一共有%d解法",count);

	}
	
	//编写方法，放置第n个皇后
	private void check(int n) {
		if(n == max) {// 当n=8时，8个皇后就已经放好了
			print();
			return;
		}
		
		//依次放入皇后，并判断是否冲突
		//注意：check是每次递归时，进入到check中都有for(int i = 0; i < max; i++)，因此会有回溯
		for(int i = 0; i < max; i++) {
			//先把当前的皇后n，放到该行的第一列
			array[n] = i;
			if(judge(n)) {//不冲突
				//接着放n+1个皇后，开始递归
				check(n+1);
			}
			//如果冲突，就继续执行array[n] = i，即将第n个皇后放置在本行的后移的一个位置
		}
	}
	
	/**
	 * 查看当我们放置第n个皇后，就去检测该皇后是否和前面已经摆放的皇后冲突
	 * @param n 表示第n个皇后
	 * @return
	 */
	private boolean judge(int n) {
		for (int i = 0; i < n; i++) {
			//array[i] == array[n] 表示判断第n个皇后是否和前面的n-1个皇后在同一列
			//Math.abs(n-i) == Math.abs(array[n] - array[i]) 表示判断第n个皇后是否和第i个皇后是否在同一斜线
			if(array[i] == array[n]  || Math.abs(n-i) == Math.abs(array[n] - array[i])) {
				return false;
			}
		}
		return true;
	}
	
	//写一个方法，可以将皇后摆放的位置输出
	private void print() {
		count++;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
