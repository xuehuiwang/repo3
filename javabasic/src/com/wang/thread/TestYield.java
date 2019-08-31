package com.wang.thread;

public class TestYield {
    public static void main(String[] args) {
            YY yy = new YY();
            Thread thread = new Thread(yy);
            thread.start();

        for(int i = 0 ; i < 1000 ; i++){
            if(i%30==0){
                Thread.yield();
            }
            System.out.println("main--->"+i);
        }
    }
}

class YY implements Runnable{

    @Override
    public void run() {
            for(int i = 0 ; i < 1000 ; i++){
                System.out.println("yy-->"+i);
            }
        }
}
