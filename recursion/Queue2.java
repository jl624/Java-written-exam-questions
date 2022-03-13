package com.jl.recursion;

import java.util.Scanner;

/**
 * 2n�ʺ�����
 * @author jinlei
 * @time 2022��3��11������8:28:28
 */
public class Queue2 {
    
	static int count = 0;//��¼����
	static int max = 0; //���̴�С
	static int[] white = null;//��Ű׻ʺ�
	static int[] black = null;//��źڻʺ�
	static int[][] arr = null;//���̳�ʼ��
	
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
	 * ���ð׻ʺ�
	 * @param n
	 */
	public static void putWhite(int n) {
		
		if(n == max) {//�׻ʺ��ѷ���
			putBlock(0);//��ʼ�źڻʺ�
			return;
		}
		for (int i = 0; i < max; i++) {
			if(arr[n][i] == 1) {//�жϴ�λ���Ƿ��ܷ��ûʺ�
				white[n] = i;//����n���ʺ���õ�λ��i��i�У�
			}else {
				continue;//��λ�ò��ܷţ���������ѭ�������õ���һ��
			}
			if(judgeW(n)) {//����ͻ
				putWhite(n+1);//�ݹ����һ���ʺ�
			}
		}
	}
	/**
	 * ���úڻʺ�
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
	 * �жϰ׻ʺ��Ƿ��ͻ
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
	 * �жϺڻʺ��Ƿ��ͻ
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
