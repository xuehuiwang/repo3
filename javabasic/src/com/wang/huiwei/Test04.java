package com.wang.huiwei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1123345-->54321
 * 思路：转成可变字符串-->反转-->利用map的containsKey()方法
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuffer sbf = new StringBuffer(a+"");//1.转成可变字符串
        sbf.reverse();//2.反转字符串
        Map<Character,Integer> map = new HashMap<Character, Integer>();//创建map集合
        StringBuffer sbf1 = new StringBuffer();//sbf1用于存放新的字符串
        for(int i = 0; i < sbf.length(); i++){
            if (!map.containsKey(sbf.charAt(i))){
                map.put(sbf.charAt(i),1);
                sbf1.append(sbf.charAt(i));
            }
        }
        int b = Integer.parseInt(sbf1+"");
        System.out.println(b);
    }
}
