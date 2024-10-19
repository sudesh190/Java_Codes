package com.SetCollection;

import java.util.LinkedHashSet;

public class LinkedHashSet1
{
    public static void main(String[] args) {
        //maintains Insertion order
        //Duplicate elements not allowed

        LinkedHashSet<String> str1 = new LinkedHashSet<>();
        str1.add("Sudesh");
        str1.add("Mahesh");
        str1.add("Amol");

        System.out.println(str1.size());
        System.out.println("***********");

        for (String s1: str1)
        {
            System.out.println(s1);
        }
    }
}
