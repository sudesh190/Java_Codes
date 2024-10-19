package com.CollectionsClass;

import java.util.Comparator;
import java.util.HashSet;

public class HashSetSort1
{
    public static void main(String[] args) {
        HashSet<EmpInfo1> Collset = new HashSet<>();
        Collset.add(new EmpInfo1(101,"Amol",45000));
        Collset.add(new EmpInfo1(102,"Mahesh",56000));
        Collset.add(new EmpInfo1(103,"Sudesh",56000));

        Collset.forEach(ref-> System.out.println(ref.id+" "+ref.name+" "+ ref.salary));
        System.out.println("**************Ascending Order on name**************");
        Collset.stream().sorted(Comparator.comparing(s1->s1.name))
                .forEach(std1-> System.out.println(std1.id+" "+" "+std1.name+" "+std1.salary));

        System.out.println("*************Descending Order on name****************");
        Collset.stream().sorted(Comparator.comparing(s1->s1.name,Comparator.reverseOrder()))
                .forEach(std2-> System.out.println(std2.id+" "+std2.name+" "+ std2.salary));

        System.out.println("**************Ascending Order on id*******************");
        Collset.stream().sorted(Comparator.comparingInt(s1-> s1.id))
                .forEach(std2-> System.out.println(std2.id+" "+std2.name+" "+ std2.salary));

        System.out.println("**************Descending Order on id******************");
        Collset.stream().sorted(Comparator.comparingInt(s1-> -s1.id))
                .forEach(std3-> System.out.println(std3.id+" "+std3.name+" "+ std3.salary));

        System.out.println("***********Ascending Order on salary****************");
        Collset.stream().sorted(Comparator.comparingDouble(s1-> s1.salary))
                .forEach(std4-> System.out.println(std4.id+" "+std4.name+" "+ std4.salary));

        System.out.println("***********Descending Order on Salary***************");
        Collset.stream().sorted(Comparator.comparingDouble(s1-> -s1.salary))
                .forEach(std5-> System.out.println(std5.id+" "+std5.name+" "+ std5.salary));


    }
}
