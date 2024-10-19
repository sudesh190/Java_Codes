package com.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        StdInfo2 s1 = new StdInfo2(101, "Sudesh");
        StdInfo2 s2 = new StdInfo2(102, "Mahesh");
        StdInfo2 s3 = new StdInfo2(103, "Amol");

        HashMap<Integer, StdInfo2> map1 = new HashMap<>(Map.of(1, s1, 2, s2, 3, s3));
        System.out.println("******For each loop*************");
        for (Map.Entry<Integer,StdInfo2> ref: map1.entrySet())
        {
            StdInfo2 sref = ref.getValue();
            System.out.println(ref.getKey()+" "+sref.id+" "+sref.name);
        }
        System.out.println("*******************");
        System.out.println("Lambda Expression*********");

        map1.forEach((k,v)-> System.out.println(k+" "+ v.id+" "+v.name));
    }
}
