package com.CollectionsClass;

import java.util.ArrayList;
import java.util.List;

public class ListSorting2
{
    public static void main(String[] args)
    {
        EmpInfo1 e1 = new EmpInfo1(101 , "Amol",99999);
        EmpInfo1 e2 = new EmpInfo1(102,"Mahesh",98000);
        EmpInfo1 e3 = new EmpInfo1(103,"Sudesh",88000);

        ArrayList<EmpInfo1> CollEmp = new ArrayList<>(List.of(e1,e2,e3));
        System.out.println("***List before sorting*********");
        CollEmp.forEach(ref-> System.out.println(ref.id+" "+ ref.name+" "+ ref.salary));

        System.out.println("******After Sorting in Ascending Order on id**********");
        CollEmp.sort((s1,s2)-> Integer.compare(s1.id, s2.id));
        CollEmp.forEach(ref-> System.out.println(ref.id+" "+ref.name+" "+ ref.salary));

        System.out.println("********Reverse Order sorting on id***********");
        CollEmp.sort((s1,s2)-> Integer.compare(s2.id, s1.id));
        CollEmp.forEach(ref-> System.out.println(ref.id+" "+ref.name+" "+ ref.salary));

        System.out.println("*******Ascending Order Sorting on name*******");
        CollEmp.sort((n1,n2)-> n1.name.compareTo(n2.name));
        CollEmp.forEach(ref-> System.out.println(ref.id+" "+ref.name+" "+ ref.salary));
        

        System.out.println("********Descending Order Sorting on name********");
        CollEmp.sort((n1,n2)-> n2.name.compareTo(n1.name));
        CollEmp.forEach(ref-> System.out.println(ref.id+" "+ref.name+" "+ ref.salary));

        System.out.println("*********Ascending Order Sorting On Salary***********");
        CollEmp.sort((p1,p2)-> Double.compare(p1.salary, p2.salary));
        CollEmp.forEach(ref-> System.out.println(ref.id+" "+ref.name+" "+ ref.salary));

        System.out.println("********Descending Order Sorting on salary***********");
        CollEmp.sort((p1,p2)-> Double.compare(p2.salary, p1.salary));
        CollEmp.forEach(ref-> System.out.println(ref.id+" "+ref.name+" "+ ref.salary));

    }
}
