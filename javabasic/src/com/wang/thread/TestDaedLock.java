package com.wang.thread;

public class TestDaedLock {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        DeadLockA da = new DeadLockA(obj1,obj2);
        DeadLockB db = new DeadLockB(obj1,obj2);
        Thread ta = new Thread(da);
        Thread tb = new Thread(db);
        ta.start();
        tb.start();
    }
}

class DeadLockA implements Runnable{
    Object obj1;
    Object obj2;

    public DeadLockA(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        test();
    }

    public void test(){
        synchronized (obj1){
            System.out.println("DeadLockA开始执行...obj1被锁,下一步锁住obj2。。。");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            synchronized (obj2){
                System.out.println("obj1被DeadLockB锁住");
            }
        }
    }
}

class DeadLockB implements Runnable{
    Object obj1;
    Object obj2;

    public DeadLockB(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        test();
    }

    public void test(){
        synchronized (obj2){
            System.out.println("DeadLockB开始执行...obj2被锁.下一步锁obj1。");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            synchronized (obj1){
                System.out.println("obj2被DeadLockA锁住");
            }
        }
    }
}
