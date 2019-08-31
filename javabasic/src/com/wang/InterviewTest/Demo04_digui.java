package com.wang.InterviewTest;
/*
编程题：有n步台阶，一次只能上1步或2步，共有多少种走法？
 */

public class Demo04_digui {
    public static void main(String[] args) {
        Method01_digui m1 = new Method01_digui();
        double start1 = System.currentTimeMillis();
        int sum = m1.digui(40);
        double end1 = System.currentTimeMillis();
        System.out.println(end1-start1);
        System.out.println(sum);

        Mehtod02_loop loop = new Mehtod02_loop();
        double start2 = System.currentTimeMillis();
        int su = loop.loop(100000000);
        double end2 = System.currentTimeMillis();
        System.out.println(end2-start2);
        System.out.println(su);

    }
}
//递归方法
class Method01_digui{
    public int digui(int n){
        if (n<1){
            throw new RuntimeException("n不能小于1");
        }
        if (n==1||n==2){
            return n;
        }
        return digui(n-2)+digui(n-1);
    }
}

//循环遍历
class Mehtod02_loop{
    public int loop(int n){
        if (n<1){
            throw new RuntimeException("n不能小于1");
        }
        if (n==1||n==2){
            return n;
        }
        int one = 2;
        int two = 1;
        int sum = 0;
        for(int i = 3 ; i <= n; i++){
            sum = one + two;
            two = one;
            one = sum;
        }
        return sum;
    }
}
