package com.wang.map;

import java.util.*;

/*
map集合遍历
 */
public class demo01_bianli {
    public static void main(String[] args) {
        //创建map集合
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","唐博");
        map.put("sex","男");
        map.put("age",26);
        map.put("job","ITmonkey");
        map.put("salary","5000");
        //遍历key,value
        // 方法一：keyset()获取key的set集合,然后遍历set集合
//        Set<String > key = map.keySet();
//        for(String str:key){
//            System.out.println("增强for循环遍历key值："+str);
//        }

        //方法二：keyset()获取key的set集合，然后itetator迭代器遍历
//        Iterator<String> it = key.iterator();
//        while (it.hasNext()){
//            System.out.println("迭代器遍历key值："+ it.next());
//            if(it.next().equals("job")){
//                it.remove();
//            }
//        }

        //通过entrySet()
        //方法三：通过迭代器
        Iterator<Map.Entry<String,Object>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String ,Object> entry = iterator.next();
//            System.out.println("key："+entry.getKey());
//            System.out.println("value："+entry.getValue());
//        }

        //方法四：通过增强for循环
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("key："+entry.getKey());
            System.out.println("value："+entry.getValue());
        }
        //获取value值，不能获取key
        for(Object obj:map.values()){
            System.out.println("values()方法："+obj);
        }
    }
}
