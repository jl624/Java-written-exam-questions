package com.jl;

import java.util.Scanner;

/**
 * �������� �޸����顾��ʮ�졿��ʡ�������о����顿
 * @author jinlei
 *
 */
public class Text4 {

	static int[] f = new int[2000000];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//��ȡ��һ������
		//int n = Integer.parseInt(sc.nextLine());
		int n = sc.nextInt();
		int[] data = new int[n];
		
		//��ʼ��f����
		for (int i = 1; i < f.length; i++) {
			f[i]=i;
		}
		//��ȡ�ڶ������ݣ��ŵ�������
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
	
	//���鼯
	public static int find(int x) {
		if(x == f[x]) {
			return x;
		}else {
			f[x] = find(f[x]);
			return f[x];
		}
	}



}
