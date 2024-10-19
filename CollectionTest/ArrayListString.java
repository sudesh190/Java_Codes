package com.CollectionTest;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListString
{

    public static void main(String[] args)
    {
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("Java");
        str1.add("C++");
        str1.add("C");
        str1.add("Kotlin");
        str1.add("C#");
        str1.add("Java");
        str1.add("C++");

        System.out.println("Arrayist with  duplicate elements : "+str1);
        System.out.println("******************");

        LinkedHashSet<String> str2 = new LinkedHashSet<>(str1);
        System.out.println("List after removed duplicate is :"+ str2);

    }
}
