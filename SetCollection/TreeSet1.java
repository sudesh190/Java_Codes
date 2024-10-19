package com.SetCollection;

import java.util.TreeSet;

public class TreeSet1
{
    public static void main(String[] args)
    {
        //Maintains Insetion in Ascending order
        //Duplicates are not allowed

        TreeSet<String> str2 = new TreeSet<>();
        str2.add("Sudesh");
        str2.add("Mahesh");
        str2.add("Amol");
        str2.add("Shinde");
        str2.add(" ");
        str2.add("Sudesh");

        System.out.println(str2.size());
        System.out.println("*******for each loop**********");
        for (String s2: str2)   //for each loop
        {
            System.out.println(s2); //Here s2 object is printed because it contains elements all having same datatype
        }
        System.out.println("*******Lamda Expression*********");
        str2.forEach(ref-> System.out.println(ref)); //Lamda Expression
    }
}
