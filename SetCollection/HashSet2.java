package com.SetCollection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HashSet2
{
    public static void main(String[] args)
    {
        //does not maintains insertion order

        EmpData2 e1 = new EmpData2(101 , "Sudesh" , 90000.8);
        EmpData2 e2 = new EmpData2(102 , "Mahesh" , 99000.8);
        EmpData2 e3 = new EmpData2(103 , "Amol" , 100000.3);

        HashSet<EmpData2> obj2 = new HashSet<>(Set.of(e1,e2,e3));
        for (EmpData2 ref1: obj2)
        {
            System.out.println(ref1); //hashcode is printing
        }

        System.out.println("******Lamda Expression********");
        obj2.forEach(ref2 -> System.out.println(ref2.id2+" "+ref2.name2+" "+ref2.salary2));
    }
}
