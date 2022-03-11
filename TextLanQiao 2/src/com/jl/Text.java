package com.jl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 十六进制转八进制
 * @author jinle
 *
 */
public class Text {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//存储十六进制
		List list1 = new ArrayList<Integer>();
		//存储八进制
		List list2 = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		for(int i = 0;i < n; i++) {
			list1.add(sc.next());
		}
		
		String hexStr = "";//暂时存储十六进制的字符串
		String binStr = "";//暂时存储十六进制对应的二进制的字符串
		
		for(int i = 0; i < n; i++) {
			hexStr = (String)(list1.get(i));
			
			StringBuilder sb = new StringBuilder();
			
			for(int j = 0;j < hexStr.length();j++) {
				//将每一个十六进制的数转换为对应的 十进制
				int ten = Integer.valueOf(hexStr.charAt(j) + "",16);
				binStr = Integer.toBinaryString(ten);//十进制转换为二进制
				//四位二进制对应一个十六进制数，不足四位补0，题目说十六进制首位不能有0
				while(binStr.length() < 4 && j != 0) {
					binStr = "0" + binStr;
				}
				sb.append(binStr);
			}
			
			//二进制转换为八进制，每三位二进制为一位八进制数
			StringBuilder sb2 = new StringBuilder();
			int tmp = 0, m = 0;
			for(int j = sb.length()-1; j >= 0; j--) {
				tmp += Integer.parseInt(sb.charAt(j) + "") * (int)Math.pow(2, m);
				m++;
				if(m % 3 == 0){
					sb2.append(tmp);
					m = 0;
					tmp = 0;
				}
			}
			
			if(m != 0) {
				sb2.append(tmp);
			}
			
			//将每个十六进制对应的八进制存储在list2中
			//因为上面的二进制转换为八进制拼接后的是逆序的，所以需要反转
			list2.add(sb2.reverse());
			
		}
		//打印每个八进制数
		for(int i = 0;i < n; i++) {
			System.out.println(list2.get(i));
		}
		
	    

	}

}
