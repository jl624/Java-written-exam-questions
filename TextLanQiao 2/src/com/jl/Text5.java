package com.jl;

import java.util.Scanner;

/**
 * 历届真题 修改数组【第十届】【省赛】【研究生组】
 * @author jinle
 *
 */
public class Text5 {
	
	//一个用于输出，一个用于储存节点
	static int[] a1 = new int[1000010];
	static int[] a2 = new int[1000010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int count = sc.nextInt();

            while (true){
                if (a2[count] == 0) { //确定输入的值是否已经存在
                    a2[count]++;//若不存在则标记退出循环
                    break;
                }else {
                    a2[count]++;//若存在则为该标识访问次数加一减少循环次数
                    count = count + a2[count] - 1;
                }
            }
            a1[i] = count;
        }
        for (int i = 0; i < a; i++) {
            System.out.print(a1[i] + " ");
        }
        
    }

}
