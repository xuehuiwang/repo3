package com.wang.map;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo02_list_map {
    public static void main(String[] args) {
        Map<String,Object> map1 = new HashMap<String,Object>();
        map1.put("account","1111111111");
        map1.put("money","1");
        Map<String,Object> map2 = new HashMap<String,Object>();
        map2.put("account","2222222222");
        map2.put("money","2");
        Map<String,Object> map3 = new HashMap<String,Object>();
        map3.put("account","3333333333");
        map3.put("money","3");
        List<Map> list = new ArrayList<Map>();
        list.add(map1);
        list.add(map2);
        list.add(map3);
        System.out.println(list);
        String account = null;
        if(null != list){
            if (list.size()==1){
                account = (String) list.get(0).get("account");
            }else if (list.size()>1){
                account = (String) list.get(0).get("account");
                for (int i = 1; i < list.size(); i++) {
                    account = account+"||"+list.get(i).get("account");
                }
            }

        }

        System.out.println("account: "+account);

        List<Map> newList = new ArrayList<Map>();
        BigDecimal sum = new BigDecimal("0");
        for(Map map:list){
            sum = sum.add(new BigDecimal(map.get("money")+""));
            newList.add(map);
            if (sum.compareTo(new BigDecimal("2"))==1){
                break;
            }
        }
        System.out.println("新集合："+newList);
    }
}
