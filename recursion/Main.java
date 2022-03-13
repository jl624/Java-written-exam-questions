package com.jl.recursion;

import java.util.Scanner;

public class Main {

	static int count = 0;//����ж����ַ���
    static int[] white = null;//��Ű׻ʺ�
    static int[] black = null;//��źڻʺ�
    static int queens = 0;//���̴�С
    static int[][] arr = null;//��ʼ������

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        queens = scan.nextInt();
        white = new int[queens];
        black = new int[queens];
        arr = new int[queens][queens];
        //��ʼ������
        for (int i = 0; i < queens; i++) {
            for (int j = 0; j < queens; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        scan.close();
        checkWhite(0);
        System.out.println(count);
    }

    /**
     * ���ð׻ʺ�
     *
     * @param n
     */
    private static void checkWhite(int n) {
        //�ȷ��ð׻ʺ󣬵�n=queens˵�����һ���׻ʺ��Ѿ�����
        if (n == queens) {
            checkBlock(0);//�׻ʺ�����꣬����úڻʺ�
            return;
        }
        for (int i = 0; i < queens; i++) {
            if (arr[n][i] == 1) {//�жϴ�λ���Ƿ���ԷŻʺ󣬴�λ��Ϊ1˵�����Է���
                white[n] = i;//����n���ʺ���õ�λ��i��i��ʾ��i��
            } else {
                continue;//����λ�ò��ܷ��ã����������ѭ���������Է��õ���һ��
            }
            if (judgeW(n)) {//�����Ƿ��ͻ
                checkWhite(n + 1);//����ͻ��ݹ������һ���ʺ�
            }
        }
    }

    /**
     * ���úڻʺ�
     *
     * @param m
     */
    private static void checkBlock(int m) {
        if (m == queens) {//��m=queens��ʾ�ڻʺ��Ѿ����ý���
            count++;
            return;
        }
        for (int i = 0; i < queens; i++) {
            if (arr[m][i] == 1 && i != white[m]) {//i��=white[m]��ʾ��λ��û�з��ð׻ʺ�
                black[m] = i;
            } else {
                continue;
            }
            if (judgeB(m)) {
                checkBlock(m + 1);
            }
        }
    }


    /**
     * �жϰ׻ʺ��Ƿ��ͻ
     *
     * @param n ��n���ʺ�
     * @return
     */
    private static boolean judgeW(int n) {
        for (int i = 0; i < n; i++) {
            if (white[i] == white[n] || Math.abs(n - i) == Math.abs(white[n] - white[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * �жϺڻʺ��Ƿ��ͻ
     *
     * @param m
     * @return
     */
    private static boolean judgeB(int m) {
        for (int i = 0; i < m; i++) {
            if (black[i] == black[m] || Math.abs(m - i) == Math.abs(black[m] - black[i])) {
                return false;
            }
        }
        return true;
    }

}
