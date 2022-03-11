package com.jl;

import java.util.Scanner;

/**
 * 历届真题 修改数组【第十届】【省赛】【研究生组】
 * @author jinlei
 *
 */
public class Text4 {

	static int[] f = new int[2000000];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//获取第一行数据
		//int n = Integer.parseInt(sc.nextLine());
		int n = sc.nextInt();
		int[] data = new int[n];
		
		//初始化f数组
		for (int i = 1; i < f.length; i++) {
			f[i]=i;
		}
		//获取第二行数据，放到数组中
		for (int i = 0; i < n; i++) {
			data[i]=sc.nextInt();
		}
		
		for (int i = 0; i < data.length; i++) {
			int k = find(data[i]);
			data[i] = k;
			f[data[i]] = find(data[i]+1);
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}			
	}
	
	//并查集
	public static int find(int x) {
		if(x == f[x]) {
			return x;
		}else {
			f[x] = find(f[x]);
			return f[x];
		}
	}



}
