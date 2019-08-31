package com.wang.datastructure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
数据结构：1.线性结构-数组
    -数组的创建
 */
public class Stru01_Array {
    public static void main(String[] args) {
        //创建数组:三种方式
        int[] arr = new int[3];
        int[] arr1 = new int[]{1,2,3};
        //获取数组长度
        int length = arr.length;
        System.out.println("arr数组的长度："+length);
        //访问数组中的元素
        int a0 =arr[0];
        System.out.println("数组第一个值："+a0);
        //数组中的元素赋值
        arr[0]=99;
        System.out.println("数组第一个值："+arr[0]);
        //遍历数组
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println("数组第"+(i+1)+"个元素为："+arr1[i]);
        }

        //数组长度不可变，增加一个元素解决思路：1-创建新数组，长度比之前大1 2-加入数组末端 3-新数组赋值给老数组
        int[] arr2 = {4,5,6};
        System.out.println("老数组arr2："+ Arrays.toString(arr2));
        int dst = 7;
        //1.创建新的数组
        int[] arr3 = new int[arr2.length+1];
        //给数组arr3中的元素赋值
        for (int i = 0; i < arr3.length; i++){
            if (i < arr3.length-1)
                arr3[i] = arr2[i];
            else
                arr3[i] = dst;
        }
        arr2 = arr3;
        System.out.println("新数组arr2："+Arrays.toString(arr2));

        //删除其中一个元素：1-创建新数组，长度小1 2-给新数组赋值 3-赋值给老数组
        int[] arr4 = new int[]{10,20,30,40,50,60};
        System.out.println("老数组arr4："+Arrays.toString(arr4));
        //删除的元素下标
        int delindex = 3;
        //1.创建新的数组
        int[] newarr4 = new int[arr4.length-1];
        //2.赋值给新数组
        for(int i = 0; i < newarr4.length; i++){
            if (i<delindex)
                newarr4[i] = arr4[i];
            else
                newarr4[i] = arr4[i+1];
        }
        //3.赋值
        arr4 = newarr4;
        System.out.println("新数组arr4"+Arrays.toString(arr4));

        //数组中插入一个元素 1-创建新的数组  2-给新数组赋值  3-新数组赋值给老数组
        int[] arr5 = {1,3,5,7,9};
        int insindex = 2;
        //1.创建新的数组
        int[] newarr5 = new int[arr5.length+1];
        //2.赋值
        /**
         * 13579
         * 134579
         */
        for (int i = 0; i < newarr5.length; i++){
            if (i<0||i>newarr5.length)
                throw new RuntimeException("数组下标越界");
            if (i<insindex)
                newarr5[i] = arr5[i];
            else if (i==insindex)
                newarr5[i] = 4;
            else
                newarr5[i] = arr5[i-1];

        }
        //3.赋值
        arr5 = newarr5;
        arr5 = newarr5;
        System.out.println("数组arr5："+ Arrays.toString(arr5));
    }
}
