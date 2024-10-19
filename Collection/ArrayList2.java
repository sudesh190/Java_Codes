package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2
{
    public static void main(String[] args)
    {
        ArrayList<String> str = new ArrayList<>();

        str.add("Java");
        str.add("c++");
        str.add("kotlin");
        str.add("Ruby");
        str.add("Python");

        System.out.println(str);

        System.out.println("***********************");

        for (String s: str)    // for each loop
        {
            System.out.println(s);
        }

        System.out.println("********************");
        System.out.println("Iterator");

        //Iterator is a interface used to iterate through the object of all collections like list , queue, set
        Iterator<String> obj = str.iterator();

        while (obj.hasNext())
        {
            String s1 = obj.next();
            System.out.println(s1);
        }

        System.out.println("****************");
        System.out.println("List Iterator with Insertion order ");

        //ListIterator is also a interface used to iterate through the object of List Collection only
        ListIterator<String> obj2 = str.listIterator();    // only  for list(ArrayList and LinkedList)
        while (obj2.hasNext())
        {
           String s2 = obj2.next();
            System.out.println(s2);
        }
        System.out.println("************************");
        System.out.println("Reverse Order");

        while (obj2.hasPrevious())
        {
            String s3 = obj2.previous();
            System.out.println(s3);
        }

        }

    }


