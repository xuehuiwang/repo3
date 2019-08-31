package com.wang.thread;

public class Main {
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        Thread02 thread02 = new Thread02();
        Thread t = new Thread(thread02);
         thread01.start();
         t.start();
    }
}
