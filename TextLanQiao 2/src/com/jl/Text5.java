package com.jl;

import java.util.Scanner;

/**
 * �������� �޸����顾��ʮ�졿��ʡ�������о����顿
 * @author jinle
 *
 */
public class Text5 {
	
	//һ�����������һ�����ڴ���ڵ�
	static int[] a1 = new int[1000010];
	static int[] a2 = new int[1000010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int count = sc.nextInt();

            while (true){
                if (a2[count] == 0) { //ȷ�������ֵ�Ƿ��Ѿ�����
                    a2[count]++;//�������������˳�ѭ��
                    break;
                }else {
                    a2[count]++;//��������Ϊ�ñ�ʶ���ʴ�����һ����ѭ������
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
