package com.CollectionFramework;

import java.util.TreeMap;

public class TreeMap1
{
    public static void main(String[] args)
    {
        TreeMap<Integer,String> tr = new TreeMap<>();
        // elements are auto sorted
        System.out.println("Elements are auto sorted");
        tr.put(101,"Sudesh");
        tr.put(103,"Amol");
        tr.put(102,"Mahesh");

        System.out.println(tr);

    }
}
