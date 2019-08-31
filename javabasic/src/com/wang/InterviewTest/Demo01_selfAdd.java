package com.wang.InterviewTest;
/*
i++和++i的区别及用法
1.i++先将i的值赋值给(i++),然后i自增1
2.++i先自身自增1，然后将自增后的值赋值给(++i)
 */
public class Demo01_selfAdd {
    public static void main(String[] args) {
        int i = 1;
        i = i++;//过程：1.（i++）=1 2.i自增，i变为2 3.赋值，将i++赋值给i,i最终还是1
        System.out.println(i);
        int j = i++;//j==1  i=2
        int k = i + ++i * i++;//2+3*3 = 11
        System.out.println("k = "+k);

    }
}
