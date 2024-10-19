package com.CollectionsClass;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetSort1
{
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhset = new LinkedHashSet<>();
        lhset.add(11);
        lhset.add(12);
        lhset.add(10);
        lhset.add(17);

        System.out.println(lhset);

        TreeSet<Integer> tr = new TreeSet<>(lhset);
        System.out.println(tr);
    }
}
