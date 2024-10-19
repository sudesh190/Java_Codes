package com.CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap2
{
    public static void main(String[] args)
    {
       StdInfo1 s1 = new StdInfo1(101,2200);
       StdInfo1 s2 = new StdInfo1(102,3300);

        LinkedHashMap<Integer,StdInfo1> map1 = new LinkedHashMap<>(Map.of(1,s1,2,s2));
        System.out.println("******For each loop***********");
        for (Map.Entry<Integer,StdInfo1> ref: map1.entrySet())
        {
            StdInfo1 s4 = ref.getValue();
            System.out.println(ref.getKey() +" "+s4.id+" "+s4.salary);
        }

        System.out.println("********************");
        System.out.println("****Lambda Expression************");
        map1.forEach((k,v)-> System.out.println(k+" "+ v.id+" "+ v.salary));
    }
}
