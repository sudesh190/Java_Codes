package com.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMap1
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> colors = new HashMap<>();
        colors.put(100,"Yellow");
        colors.put(101,"Black");
        colors.put(105,"purple");
        colors.put(102,"Red");
        colors.put(103,"White");
        System.out.println(colors);
        System.out.println("**********For each loop**********");
        for (Map.Entry<Integer,String> ref: colors.entrySet())
        {
            System.out.println(ref.getKey()+" "+ref.getValue());
        }
        System.out.println("*****************");
        colors.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
