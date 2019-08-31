package com.wang.huiwei;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
    /*
    把字符串String str = "我爱 中国 共产党";
    根据空格倒叙--》共产党中国爱我
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for(String ss:arr){//打印去掉空格的字符串
            System.out.print(ss);
        }
        System.out.println();
        // 把原数组元素倒序遍历
        String temp = "";
        for(int i = 0; i < arr.length/2; i++) {
            // 把数组中的元素收尾交换
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        String sss = "";
        for(String ss:arr){//打印去掉空格并反序后的字符串
            sss = sss+ss;
        }
        System.out.println(sss);
    }

}
