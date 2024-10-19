package com.Polymorphism;

public class MethodOverloadingExm
{
    public void add(int a , int b)
    {
        System.out.println(a+b);
    }
    public void add(int a , double b)
    {
        System.out.println(a+b);
    }
    public void add(String a, int b)
    {
        System.out.println(a+b);
    }
    public void add(int b , String a )
    {
        System.out.println(b+a);
    }
    public static void main(int a)
    {
        System.out.println("We can also overload Main methid , just signature or parametrs shold be different");
    }
    public static void main(double b)
    {
        System.out.println("Main method with double parameter");
    }

    public static void main(String[] args) {
        MethodOverloadingExm m1 = new MethodOverloadingExm();
        m1.add(2 , 3);
        m1.add(2 , 22.);
        m1.add("Sudesh" , 2);
        m1.add(5 , "Sudesh");
        MethodOverloadingExm.main(2);
        MethodOverloadingExm.main(22.5);
    }
}
