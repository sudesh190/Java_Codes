package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList3
{
    public static void main(String[] args)
    {
        ArrayList<String> str1 = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();
        System.out.println("Size of Arraylist before insertion of elementts :"+str1.size());
        str1.add("Sinhgad");
        str1.add("Institute");
        str1.add("Technology");
        str1.add("Science");
        str1.add("Pune");

        System.out.println(str1);
        System.out.println("Size of Arraylist After insertion of elements :"+str1.size());
        System.out.println("*******For each loop**********");

        for (String s1 : str1)
        {
            System.out.println(s1);
        }

        System.out.println("****** Iterator and while loop**********");

        Iterator<String>  obj1 = str1.iterator(); //Iterator is an interface used to looping into collections
        while (obj1.hasNext())
        {
            String s2 = obj1.next();
            System.out.println(s2);
        }
        System.out.println("*******ListIterator and While loop********");
        ListIterator<String> obj2 = str1.listIterator(); //ListIterator is also an interface used to looping into collections

        while (obj2.hasNext())    // Prints object By Insertion Order
        {
            String s3 = obj2.next();
            System.out.println(s3);
        }
        System.out.println("*****While loop in ListIterator to print object in opposite of order of insertion*******");

        while (obj2.hasPrevious())
        {
            String s3 = obj2.previous();
            System.out.println(s3);
        }
        System.out.println("****Second arraylist*******");
        str2.add("Shrimati Savitribai");
        str2.add("Jyotiba");
        str2.add("Phule");
        str2.add("University");

        System.out.println(str2);
        str2.addAll(str1);
        System.out.println("After Adding str1 in str2 , str2 becomes:" + str2);
        System.out.println("Size of str2 after adding str1 into it :"+str2.size());
        System.out.println("************************");
        str2.removeAll(str1);
        System.out.println("Size of str2 after removing str1 into it :"+str2.size());
        str1.set(2,"Sudesh");
        System.out.println("replaced element at index 2 of str1 is :"+str1.get(2));
    }
}
