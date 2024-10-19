package com.CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1
{
    public static void main(String[] args)
    {
        LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>();
        map2.put(100,"Sinhagad");
        map2.put(101,"Torana");
        map2.put(102,"Ratangad");

        System.out.println(map2);
        System.out.println("******For each loop**********");
        for (Map.Entry<Integer,String> ref: map2.entrySet())
        {
            System.out.println(ref.getKey()+" "+ref.getValue());
        }
        System.out.println("*****Labda Expression*********");
        map2.forEach((k,v) -> System.out.println(k+" "+v));
    }
}
