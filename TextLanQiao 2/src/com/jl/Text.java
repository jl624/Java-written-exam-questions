package com.jl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ʮ������ת�˽���
 * @author jinle
 *
 */
public class Text {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�洢ʮ������
		List list1 = new ArrayList<Integer>();
		//�洢�˽���
		List list2 = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		for(int i = 0;i < n; i++) {
			list1.add(sc.next());
		}
		
		String hexStr = "";//��ʱ�洢ʮ�����Ƶ��ַ���
		String binStr = "";//��ʱ�洢ʮ�����ƶ�Ӧ�Ķ����Ƶ��ַ���
		
		for(int i = 0; i < n; i++) {
			hexStr = (String)(list1.get(i));
			
			StringBuilder sb = new StringBuilder();
			
			for(int j = 0;j < hexStr.length();j++) {
				//��ÿһ��ʮ�����Ƶ���ת��Ϊ��Ӧ�� ʮ����
				int ten = Integer.valueOf(hexStr.charAt(j) + "",16);
				binStr = Integer.toBinaryString(ten);//ʮ����ת��Ϊ������
				//��λ�����ƶ�Ӧһ��ʮ����������������λ��0����Ŀ˵ʮ��������λ������0
				while(binStr.length() < 4 && j != 0) {
					binStr = "0" + binStr;
				}
				sb.append(binStr);
			}
			
			//������ת��Ϊ�˽��ƣ�ÿ��λ������Ϊһλ�˽�����
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
			
			//��ÿ��ʮ�����ƶ�Ӧ�İ˽��ƴ洢��list2��
			//��Ϊ����Ķ�����ת��Ϊ�˽���ƴ�Ӻ��������ģ�������Ҫ��ת
			list2.add(sb2.reverse());
			
		}
		//��ӡÿ���˽�����
		for(int i = 0;i < n; i++) {
			System.out.println(list2.get(i));
		}
		
	    

	}

}
