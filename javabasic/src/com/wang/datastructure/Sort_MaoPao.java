package com.wang.datastructure;

import java.util.Arrays;

public class Sort_MaoPao {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,9,4,1,7,3};
        int temp = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0 ; j < arr.length-1-i ; j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
