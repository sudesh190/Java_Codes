package com.CollectionsClass;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSort2
{
    public static void main(String[] args)
    {
        System.out.println("****** We can sort treeset based on only one type of data at a time *********");
        TreeSet<EmpInfo1> Colltr = new TreeSet<>(Comparator.comparing(s1->s1.name));
        Colltr.add(new EmpInfo1(101,"Amol",45000));
        Colltr.add(new EmpInfo1(102,"Mahesh",56000));
        Colltr.add(new EmpInfo1(103,"Sudesh",56000));

        Colltr.forEach(ref-> System.out.println(ref.id+" "+ref.name+" "+ ref.salary));
        System.out.println("*********Ascending order on name************");
        Colltr.stream().sorted(Comparator.comparing(s1-> s1.name))
                .forEach(ref-> System.out.println(ref.id+" "+ref.name+" "+ ref.salary));
        System.out.println("************Descending order  on name*************** ");
        Colltr.stream().sorted(Comparator.comparing(s1-> s1.name , Comparator.reverseOrder()))
                .forEach(ref2-> System.out.println(ref2.id+" "+ref2.name+" "+ ref2.salary));

        System.out.println("******* Create another treeset for another type of data **************");
        TreeSet<EmpInfo1> Colltr1 = new TreeSet<>(Comparator.comparingInt(s1-> s1.id));
        Colltr1.add(new EmpInfo1(101,"Amol",45000));
        Colltr1.add(new EmpInfo1(102,"Mahesh",56000));
        Colltr1.add(new EmpInfo1(103,"Sudesh",56000));

        Colltr1.forEach(ref1-> System.out.println(ref1.id+" "+ref1.name+" "+ ref1.salary));

        System.out.println("******Ascending Order on id********");
        Colltr1.stream().sorted(Comparator.comparingInt(s1->s1.id))
                .forEach(ref1-> System.out.println(ref1.id+" "+ref1.name+" "+ ref1.salary));

        System.out.println("****** Descending Order on id **************");
        Colltr1.stream().sorted(Comparator.comparingInt(s1-> -s1.id))
                .forEach(ref2-> System.out.println(ref2.id+" "+ref2.name+" "+ ref2.salary));

        System.out.println("*********************************************");
        TreeSet<EmpInfo1> Colltr2 = new TreeSet<>(Comparator.comparingDouble(s2->s2.salary));
        Colltr2.add(new EmpInfo1(101,"Amol",45000));
        Colltr2.add(new EmpInfo1(102,"Mahesh",57000));
        Colltr2.add(new EmpInfo1(103,"Sudesh",56000));


        //for each loop
        Colltr2.forEach(ref3-> System.out.println(ref3.id+" "+ref3.name+" "+ ref3.salary));
        System.out.println("******Ascending Order on Salary **************");
        Colltr2.stream().sorted(Comparator.comparingDouble(s2->s2.salary))
                .forEach(ref4-> System.out.println(ref4.id+" "+ref4.name+" "+ ref4.salary));

        System.out.println("******* Descending Order on salary *************");
        Colltr2.stream().sorted(Comparator.comparingDouble(s2-> -s2.salary))
                .forEach(ref5-> System.out.println(ref5.id+" "+ref5.name+" "+ ref5.salary));
    }
}
