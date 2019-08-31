package com.wang.datastructure;

/**
 * 递归和斐波那契数列
 * 递归：自身调用自身
 * 斐波那契数列：1，1，2，3，5，8，13
 */
public class Stru05_Recursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(20));
    }

    public static int fibonacci(int i){
        if (i==1||i==2)
            return 1;
        else
            return fibonacci(i-2)+fibonacci(i-1);
    }

    public static int hannuota(int i){
        if (i ==1)
            return 1;
        else if (i == 2)
            return 2;
        else
            return hannuota(i-2)+hannuota(i-1);
    }
}
