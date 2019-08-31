package com.wang.huiwei;

import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {
        String str = "我 热爱 这份 工作";
        //1.split()分隔空格得到String数组
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        //2.创建新可变数组乘方新的字符串
        StringBuffer sbf = new StringBuffer();
        //3.处理数据
        for(int i = arr.length-1; i>=0; i--){
            sbf= sbf.append(arr[i]);
        }
        System.out.println(sbf);
    }
}
