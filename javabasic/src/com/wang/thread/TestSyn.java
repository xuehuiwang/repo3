package com.wang.thread;

public class TestSyn {
    public static void main(String[] args) {
        Web12306 web12306 = new Web12306();
        Thread thread = new Thread(web12306,"甲某人");
        Thread thread1 = new Thread(web12306,"乙女笋");
        Thread thread2 = new Thread(web12306,"丙仙儿");

        thread.start();
        thread1.start();
        thread2.start();

    }
}

class Web12306 implements Runnable{
    private int num = 10;
    private boolean flag = true;

    @Override
    public void run() {
        try {
            while (flag) {
                test04();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //线程不安全:锁定资源不正确-锁定的只能是对象
    public void test04() throws InterruptedException {
        synchronized((Integer)num){
            if (num<=0){
                flag=false;//跳出循环
                return;//return很关键
            }
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+":抢到了第--->"+num--+" 张火车票");
        }
    }
//线程不安全:锁定范围过小
    public void test03() throws InterruptedException {
        //a,b,c
        synchronized(this){
            if (num<=0){
                flag=false;//跳出循环
                return;//return很关键
            }
        }
        Thread.sleep(500);
        System.out.println(Thread.currentThread().getName()+":抢到了第--->"+num--+" 张火车票");
    }
//线程安全
    public void test02() throws InterruptedException {
        synchronized(this){
            if (num<=0){
                flag=false;//跳出循环
                return;//return很关键
            }
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+":抢到了第--->"+num--+" 张火车票");
        }
    }
//线程安全
    public synchronized void test01() throws InterruptedException {
            if (num<=0){
                flag=false;//跳出循环
                return;//return很关键
            }
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+":抢到了第--->"+num--+" 张火车票");
    }

}