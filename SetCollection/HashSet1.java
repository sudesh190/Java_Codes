package com.SetCollection;

import java.util.HashSet;

public class HashSet1
{
    public static void main(String[] args)
    {
        HashSet<Integer> obj1 = new HashSet<>();
        obj1.add(10);
        obj1.add(11);
        obj1.add(12);
        obj1.add(10);
        obj1.add(null);
        obj1.add(null);

        System.out.println(obj1);
        System.out.println("Size:" + obj1.size());
        System.out.println("*******For each loop**********");

        for (Integer ref: obj1)
        {
            System.out.println(ref);
        }

    }
}
