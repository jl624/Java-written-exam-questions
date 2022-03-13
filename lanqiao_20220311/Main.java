package com.jl.lanqiao_20220311;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 试题 基础练习 Huffuman树
 * @author jinlei
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//第一行                                                                                                   
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int j = 0; j < n-1; j++) {
			Arrays.sort(arr);
			int sum1 = arr[j] + arr[j+1];
			arr[j] = 0;
			arr[j+1] = sum1;
			sum = sum + sum1;
		}
		System.out.print(sum);

	}

}
