package com.Collection;

import java.util.ArrayList;

public class ArrayList1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> obj = new ArrayList<>();  //Declaration
        ArrayList<Integer> obj1 = new ArrayList<>();

        System.out.println("Size of Arraylist" + obj.size());
        obj.add(10);
        obj.add(11);
        obj.add(12);
        obj.add(13);
        obj.add(14);
        System.out.println(obj);
        System.out.println(obj.isEmpty());
        System.out.println("size of Arraylist After insertion data" + obj.size());

        obj.remove(2);
        System.out.println("Arraylist after removed element :" + obj);
        System.out.println(obj.size());

        obj.set(3,200);
        System.out.println(obj);

        System.out.println(obj.get(3));

        System.out.println("********************************");
        obj1.add(20);
        obj1.add(21);
        System.out.println(obj1);

        obj1.addAll(obj);
        System.out.println("After adding obj1 into obj :" + obj);
        System.out.println(obj.size());

        System.out.println("*********");
        obj1.removeAll(obj);
        System.out.println(obj);
        System.out.println("size after removing obj1 from obj :" + obj.size());

        System.out.println("******for each loop*******");
        for (Integer ref: obj)
        {
            System.out.println(ref);
        }

    }
}
