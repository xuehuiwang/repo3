package com.wang.InterviewTest;
/*
面试题2：写一个singleton？单例模式
 */

/**
 * 懒汉式：调用方法的时候才创建对象
 * 饿汉式：只要引用这个类，对象就创建出来
 */

/**
 * 懒汉式:
 * 1.构造器私有化
 * 2.创建私有的静态属性(赋值为null)
 * 3.公共的对外方法(要判断属性是否为null,为null则new一个给静态属性,不为null则直接返回)
 */
public class Demo02_Singleton {

    private Demo02_Singleton(){};
    private static volatile Demo02_Singleton instance = null;
    public static synchronized Demo02_Singleton getInstance(){
        if(null == instance){
            instance = new Demo02_Singleton();
        }
       return instance;
    };
}

/**
 *饿汉式：
 * 1.构造器私有化
 * 2.私有的静态属性(直接把此对象赋值给属性)
 * 3.公共的对外方法
 */
class HungerySington{
    private HungerySington(){};
    private static HungerySington instance = new HungerySington();
    public static HungerySington getInstance(){
        return instance;
    }
}

class main{
    public static void main(String[] args) {
        Demo02_Singleton demo02_singleton01 = Demo02_Singleton.getInstance();
        Demo02_Singleton demo02_singleton02 = Demo02_Singleton.getInstance();
        System.out.println(demo02_singleton01);
        System.out.println(demo02_singleton02);

        System.out.println(HungerySington.getInstance());
        System.out.println(HungerySington.getInstance());
    }
}
