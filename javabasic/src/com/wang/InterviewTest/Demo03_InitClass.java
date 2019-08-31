package com.wang.InterviewTest;
/*
考点：
1.类初始化过程
2.实例初始化过程
3.方法重写
 */

/**
 * 1.类初始化过程：要创建一个类的实列，首先要加载并初始化该类
 *  -main方法所在的类需要优先加载和初始化
 * 2.一个子类需要初始化，要先初始化父类
 * 3.一个类初始化就是执行<clinit>()方法
 *  -<clinit>()方法由静态的类变量显示赋值代码和静态代码块组成
 *  -类变量显示赋值代码和静态代码块从上到下顺序执行
 *  -clinit>()方法只执行一次
 */

/**
 * 实力初始化过程
 * 1.实例初始化就是执行<init>方法
 *  -<init>方法可能重载由多个，由几个构造器就有几个<init>方法
 *  -<init>方法由非静态实例变量显示赋值代码和非静态代码块以及对应构造器代码组成
 *  -非静态实例变量显示赋值代码和非静态代码块按顺序执行，最后执行构造器代码块
 *  -子类中第一个执行的是super()方法，即父类中的方法
 *
 */

/**
 * 方法重写override
 * 1.哪些方法不需要重写？
 *  -final修饰的方法
 *  -静态方法
 *  -private修饰的方法
 * 2.对象的多态性
 *  -子类如果重写了父类的方法，通过子类对象调用的一定是子类重写过的代码
 *  -非静态方法默认的调用对象是this
 *  -this对象在构造器或者或<init>方法中就是正在创建的对象
 */
public class Demo03_InitClass {
    public static void main(String[] args) {
//        Son s1 = new Son();
//        System.out.println();
//        Son s2 = new Son();
    }
}

class Father{
    private int i = test();
    private static int j = method();
    static {
        System.out.print("(1)");
    }
    Father(){
        System.out.print("(2)");
    }
    {
        System.out.print("(3)");
    }
    public int test(){
        System.out.print("(4)");
        return 1;
    }
    public static int method(){
        System.out.print("(5)");
        return 1;
    }
}

class Son extends Father{
    private int i = test();
    private static int j = method();
    static {
        System.out.print("(6)");
    }
    Son(){
        System.out.print("(7)");
    }
    {
        System.out.print("(8)");
    }
    public int test(){
        System.out.print("(9)");
        return 1;
    }
    public static int method(){
        System.out.print("(10)");
        return 1;
    }
}
