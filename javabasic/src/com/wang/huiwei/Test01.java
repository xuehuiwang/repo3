package com.wang.huiwei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test01 {
    /*
	提取不重复的整数
	题目描述
	输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
	输入描述:
	输入一个int型整数
	输出描述:
	按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
	输入例子:
	9876673
	输出例子:
	37689
	*/
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            getNewNum(sc.nextInt());
//        }
        System.out.println(Math.round(-12.5));
    }

    public static void getNewNum(int a){
        StringBuffer sb = new StringBuffer(a+"");//将int类型的a转换为可变字符串
        sb.reverse();//反转字符串
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        String str = "";
        for(int i = 0 ; i < sb.length() ; i++){
            if (!map.containsKey(sb.charAt(i))){
                map.put(sb.charAt(i),1);
//                System.out.print(sb.charAt(i));
                str = str+ sb.charAt(i);
            }
        }
        System.out.println(str);
    }
}
