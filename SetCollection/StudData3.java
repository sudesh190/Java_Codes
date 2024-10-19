package com.SetCollection;

public class StudData3 implements Comparable<StudData3>
{
    //Comparable interface is used to order the objects of user defined class
    //compareTo() method is overridden by child class (StudData3) from Comparable Interface
    int id4;
    String name4;
    double marks4;

    @Override
    public int compareTo(StudData3 o) {
        return name4.compareTo(o.name4);
    }


    public StudData3(int id4, String name4 , double marks4)
    {
        this.id4 = id4;
        this.name4 = name4;
        this.marks4 = marks4;
    }

}
