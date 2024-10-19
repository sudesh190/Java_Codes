package com.CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap2
{
    public static void main(String[] args)
    {
        StdInfo3 s1 = new StdInfo3(1,"Amol",99.6);
        StdInfo3 s2 = new StdInfo3(2,"Mahesh",98.4);
        StdInfo3 s3 = new StdInfo3(3,"Sudesh",98.3);

        TreeMap<Integer,StdInfo3> tr2 = new TreeMap<>(Map.of(101,s1,102,s2,103,s3));
        System.out.println("********For each loop**************");
        for (Map.Entry<Integer,StdInfo3> ref : tr2.entrySet())
        {
            StdInfo3 obj = ref.getValue();
            System.out.println(ref.getKey()+" "+ obj.id+" "+obj.name+" "+ obj.marks);
        }
        System.out.println("*************lamda Expression*************");
        tr2.forEach((k,v)-> System.out.println(k+" "+ v.id+" "+v.name+" "+v.marks));
    }
}
