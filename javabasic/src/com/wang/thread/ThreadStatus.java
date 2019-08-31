package com.wang.thread;

public class ThreadStatus {
    public static void main(String[] args) {
        TT tt = new TT();
        Thread thread = new Thread(tt);
        thread.start();
        for(int i = 0; i < 100 ; i++){
            if (i==50){
                //4.根据外部条件调用停止线程的方法
                tt.stop();
            }
            System.out.println("--------->"+i);
        }
    }
}

class TT implements Runnable{
    //1.线程类中定义线程体使用标志
    private boolean flag = true;

    @Override
    public void run() {
        //2.线程体使用该标志
        while(flag){
            System.out.println(Thread.currentThread().getName()+"-->"+"华为NB...");
        }
    }
    //3.提供对外的方法改变该标志
    public void stop(){
        this.flag = false;
    }
}