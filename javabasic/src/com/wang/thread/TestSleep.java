package com.wang.thread;
/*
sleep:
    倒计时:
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep {
    public static void main(String[] args) throws InterruptedException {
        Date endTime = new Date(System.currentTimeMillis()+1000*10);
        long longs  = System.currentTimeMillis();
        long end = endTime.getTime();
        System.out.println(endTime);
        System.out.println(end);
        while (true){
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            endTime = new Date(endTime.getTime()-1000);
            Thread.sleep(1000);
            if (end-1000*10>endTime.getTime()){
                break;
            }
        }
    }


}
