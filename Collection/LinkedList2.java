package com.Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList2
{
    public static void main(String[] args)
    {
        StudentData s1 = new StudentData();
        s1.setSid(101);
        s1.setSname("Sudesh");
        s1.setMarks(78.20);

        StudentData s2 = new StudentData();
        s2.setSid(102);
        s2.setSname("Mahesh");
        s2.setMarks(80.5);

        StudentData s3 = new StudentData();
        s3.setSid(103);
        s3.setSname("Amol");
        s3.setMarks(90.4);

        LinkedList<StudentData> str2 = new LinkedList<>(List.of(s1,s2,s3)); //By-using User-Defined class "StudentData"
        System.out.println("For each loop");
        for (StudentData stud : str2)    //for each loop
        {
            System.out.println(stud.getSid()+" "+stud.getSname()+" "+ stud.getMarks());
        }
        System.out.println("*************");
        System.out.println("Lambda Expression");
        str2.forEach(ref -> System.out.println(ref.getSid()+" "+ref.getSname()+" "+ ref.getMarks()));

    }
}
