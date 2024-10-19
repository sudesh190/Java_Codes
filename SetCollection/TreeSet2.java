package com.SetCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet2
{
    public static void main(String[] args)
    {
        StudData3 s1 = new StudData3(101,"Sudesh",70.3);
        StudData3 s2 = new StudData3(102,"Mahesh",80.4);
        StudData3 s3 = new StudData3(103,"Amol",90.5);

        TreeSet<StudData3> obj4 = new TreeSet<>(Set.of(s1,s2,s3));
        for (StudData3 ref: obj4)
        {
            System.out.println(ref);//hashcode is printed because ref object contains elements having different datatype
        }
        System.out.println("********Lamda expression and it prints elements of object****************");
        obj4.forEach(ref2-> System.out.println(ref2.id4+" "+ref2.name4+" "+ ref2.marks4));
    }
}
