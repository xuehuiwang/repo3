package com.wang.huiwei;

import java.util.HashMap;
import java.util.Map;

public class Test05 {
    public static void main(String[] args) {
        int a = 112663345;
        //1.转成可变字符串
        StringBuffer sbf = new StringBuffer(a+"");
        //2.反转
        sbf.reverse();
        //3.创建Map集合
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        //4.创建StringBuilder接收新的字符串
        StringBuffer sbf1 = new StringBuffer();
        //5.循环处理数据
        for(int i = 0; i < sbf.length(); i++){
            if (!map.containsKey(sbf.charAt(i))){//判断map集合的key中是否包含这个字符串，如果没有就添加进来
                map.put(sbf.charAt(i),1);
                sbf1 = sbf1.append(sbf.charAt(i));
            }
        }
        System.out.println(sbf1);
        int b = Integer.parseInt(sbf1+"");

    }
}
