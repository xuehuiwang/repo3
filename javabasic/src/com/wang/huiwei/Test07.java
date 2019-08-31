package com.wang.huiwei;

public class Test07 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer sbf = new StringBuffer(str);
        sbf.reverse();
        System.out.println(sbf);
    }
}
