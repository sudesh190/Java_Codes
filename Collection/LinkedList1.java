package com.Collection;

import java.util.LinkedList;

public class LinkedList1
{
    public static void main(String[] args)
    {
        LinkedList<String> str1 = new LinkedList<>(); // Using Wrapper classes "String".
        str1.add("Sudesh");
        str1.add("Mahesh");
        str1.add("Amol");
        System.out.println(str1);
        System.out.println("**********");

        str1.addLast("Shinde");
        str1.addFirst("Students");
        System.out.println(str1);
        System.out.println("************");

        str1.removeFirst();
        str1.removeLast();
        System.out.println(str1);
    }
}
