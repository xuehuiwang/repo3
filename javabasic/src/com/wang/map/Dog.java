package com.wang.map;

public class Dog {
   private String name;
   private int age;
   public void eatBone(){
       System.out.println("狗啃骨头...");
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Test{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("小黑..");
        dog.setAge(2);
        System.out.println("狗的名字："+dog.getName());
        System.out.println("狗的年龄："+dog.getAge());
        dog.eatBone();


        short s1 = 1;
        short s2 = 2;
        s1 = (short) (s1 + 1);
        s1 += s2;
        int s3 = s1 + s2;

        int i =1;
        i = i++;
        int j = i++;
        int k = i+++i*i++;
        System.out.println("i= "+i);
        System.out.println("j= "+j);
        System.out.println("k= "+k);
    }
}
