package com.Polymorphism;

public class ParentOverriding
{
    public ParentOverriding()
    {
        this(25);     // Calls Paremeterised constructor of same class
        System.out.println("Zero Parameterised constructor of Parent");
    }
    public ParentOverriding(int a)
    {
        System.out.println("Single Parameterised Constructor of Parent");
    }
    void Properties()
    {
        System.out.println("Get the peoperty");
    }
    void Qualification3()
    {
        System.out.println("Post graduate needed");
    }

}
class Child extends ParentOverriding
{
    @Override
    void Qualification3() {
        super.Qualification3();        // Access the method of Parent class
        System.out.println("Graduate is ok");
    }
    public Child()
    {

    }
}
class expl1
{
    public static void main(String[] args) {
        Child c5 = new Child();
        c5.Properties();
        c5.Qualification3();
    }
}
