package com.wang.thread;

public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        JJ jj = new JJ();
        Thread thread = new Thread(jj);
        thread.start();

        for(int i = 0 ; i < 1000 ; i++){
            if(i==500){
                thread.join();
            }
            System.out.println("main--->"+i);
        }
    }
}

class JJ implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i < 1000 ; i++){
            System.out.println("jj-->"+i);
        }
    }
}
