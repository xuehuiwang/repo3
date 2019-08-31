package com.wang.thread;

public class Thread02 implements Runnable {
    @Override
    public void run() {
        System.out.println("创建线程方法二：实现Runnable接口，重写run方法");
    }
}
