package com.CollectionTest;

import java.util.HashSet;

public class HashSetInt1
{
    public static void main(String[] args)
    {
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(1);
        h1.add(2);
        h1.add(3);
        h1.add(4);
        h1.add(5);
        System.out.println("Given HashSet is : "+h1);
        System.out.println("Size of HashSet is :  "+h1.size());
    }
}
