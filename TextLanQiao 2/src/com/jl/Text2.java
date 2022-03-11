package com.jl;

import java.util.Scanner;

/**
 * 十六进制转十进制
 * @author jinle 
 *
 */
public class Text2 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        while(sc.hasNext()){
		            String hex=sc.nextLine();
		            System.out.println(Long.parseLong(hex,16));
		        }

		   

	}

}
