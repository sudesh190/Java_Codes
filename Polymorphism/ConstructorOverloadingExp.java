package com.Polymorphism;

public class ConstructorOverloadingExp
{
    public ConstructorOverloadingExp()
    {
        System.out.println("Zero parametrised constructor");
    }
    public ConstructorOverloadingExp(int a)
    {
        System.out.println(" 1 int argument cnstroctor");
    }
    public ConstructorOverloadingExp(String a)
    {
        System.out.println("one String parameter constructor");
    }

    public static void main(String[] args) {
        ConstructorOverloadingExp c1 = new ConstructorOverloadingExp();
        ConstructorOverloadingExp c2 = new ConstructorOverloadingExp(2);
        ConstructorOverloadingExp c3 = new ConstructorOverloadingExp("Sudesh");
    }
}
