package com.SetCollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet2
{
    public static void main(String[] args)
    {
        StudData2 s1 = new StudData2(100,"Sudesh",78.2);
        StudData2 s2 = new StudData2(101 , "Mahesh" , 89.4);
        StudData2 s3 = new StudData2(102 , "Amol", 98.3);

        LinkedHashSet<StudData2> obj3 = new LinkedHashSet<>(Set.of(s1,s2,s3,new StudData2(104, "Ravi", 78.2)));

        obj3.forEach(ref3 -> System.out.println(ref3.id3+" "+ref3.name3+" "+ ref3.marks3));
    }
}
