package com.jl.recursion;

import java.util.Queue;

/**
 * �˻ʺ�����
 * @author jinlei
 * @time 2022��3��11������2:59:26
 */
public class Queue8 {
	
	//����һ��max��ʾ���м����ʺ�
	int max = 8;
	//����һ��array������ʺ����λ�õĽ������array=  {0��4��7��5��2��6��1��3}
	int[] array = new int[max];
	
	static int count = 0;

	public static void main(String[] args) {
		
		//����
		Queue8 queue8 = new Queue8();
		queue8.check(0);
		System.out.printf("һ����%d�ⷨ",count);

	}
	
	//��д���������õ�n���ʺ�
	private void check(int n) {
		if(n == max) {// ��n=8ʱ��8���ʺ���Ѿ��ź���
			print();
			return;
		}
		
		//���η���ʺ󣬲��ж��Ƿ��ͻ
		//ע�⣺check��ÿ�εݹ�ʱ�����뵽check�ж���for(int i = 0; i < max; i++)����˻��л���
		for(int i = 0; i < max; i++) {
			//�Ȱѵ�ǰ�Ļʺ�n���ŵ����еĵ�һ��
			array[n] = i;
			if(judge(n)) {//����ͻ
				//���ŷ�n+1���ʺ󣬿�ʼ�ݹ�
				check(n+1);
			}
			//�����ͻ���ͼ���ִ��array[n] = i��������n���ʺ�����ڱ��еĺ��Ƶ�һ��λ��
		}
	}
	
	/**
	 * �鿴�����Ƿ��õ�n���ʺ󣬾�ȥ���ûʺ��Ƿ��ǰ���Ѿ��ڷŵĻʺ��ͻ
	 * @param n ��ʾ��n���ʺ�
	 * @return
	 */
	private boolean judge(int n) {
		for (int i = 0; i < n; i++) {
			//array[i] == array[n] ��ʾ�жϵ�n���ʺ��Ƿ��ǰ���n-1���ʺ���ͬһ��
			//Math.abs(n-i) == Math.abs(array[n] - array[i]) ��ʾ�жϵ�n���ʺ��Ƿ�͵�i���ʺ��Ƿ���ͬһб��
			if(array[i] == array[n]  || Math.abs(n-i) == Math.abs(array[n] - array[i])) {
				return false;
			}
		}
		return true;
	}
	
	//дһ�����������Խ��ʺ�ڷŵ�λ�����
	private void print() {
		count++;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
