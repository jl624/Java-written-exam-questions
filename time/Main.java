package com.jl.time;

import java.util.Scanner;

/**
 * 试题 基础练习 报时助手
 * @author jinlei
 * @time 2022年3月13日上午8:54:23
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		String[] array = {"zero","one","two","three", "four", "five", "six",
				"seven", "eight", "nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen", "twenty"};
		if(h >= 0 && h <= 20) {
			System.out.print(array[h] + " ");
		}else if(h == 21){
			System.out.print(array[20] +" "+array[1]+ " " );
		}else if(h == 22){
			System.out.print(array[20] +" "+array[2]+ " " );
		}else if(h == 23){
			System.out.print(array[20] +" "+array[3]+ " " );
		}else if(h == 24){
			System.out.print(array[20] +" "+array[4]+ " " );
		}
		if(m == 0) {
			System.out.println("o'clock");
		}else if(m > 0 && m <= 20){
			System.out.print("array[m]");
		}else if(m > 20 && m < 30) {
			System.out.print(array[20] + " " + array[m-20]);
		}else if(m == 30) {
			System.out.print("thirty");
		}else if(m > 30 && m < 40) {
			System.out.print("thirty" + array[m-30]);
		}else if(m == 40){
			System.out.print("forty");
		}else if(m > 40 && m < 50) {
			System.out.print("froty" + array[m-40]);
		}else if(m == 50) {
			System.out.print("fifty");
		}else if(m > 50 && m < 60) {
			System.out.print("fifty" + array[m-50]);
		}
		

	}

}
