package com.CollectionTest;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListMerge
{
    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Sinhgadh");
        list1.add("Torana");
        list1.add("Vishalgad");
        list1.add("Sinhgadh");
        list1.add("Ramshej");
        list1.add("Sindhudurga");
        System.out.println("This is first ArrayList : "+list1);
        System.out.println("**************");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Pratapgad");
        list2.add("Vasota");
        list2.add("Kondhana");
        list2.add("Kondhana");
        list2.add("Purandar");
        list2.add("Vajragad");
        list2.addAll(list1);

        System.out.println("Two list merged with duplicates: "+list2);
        System.out.println("**************");
        System.out.println("Now we removed duplicates");
        LinkedHashSet<String> h2 = new LinkedHashSet<>(list2);
        System.out.println("Merged lists without duplicates: "+h2);

    }
}
