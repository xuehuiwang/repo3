package com.wang.huiwei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 你好 中国
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "你好 中国 真美丽";
        String [] arr = str.split(" ");//以空格分隔得到分隔后的字符串数组
        System.out.println(Arrays.toString(arr));
        StringBuffer sb = new StringBuffer("");//str1用于保存新的字符串
        for(int i = arr.length-1; i >= 0; i--){//从后向前追加成可变字符串
            sb.append(arr[i]);
        }
        System.out.println(sb);

    }
}
