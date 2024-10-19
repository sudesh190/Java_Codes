package com.HierarchicalInheritance;

public class ParentAnimal
{
    int age;
    String color;

    public ParentAnimal(int age , String color)
    {
        this.age=age;
        this.color=color;
    }

    void display()
    {
        System.out.println("Color of the Animal is :" + color);
        System.out.println("Age of Animal is :" + age);
    }
}
class Herbivorous extends ParentAnimal
{
    String Hname;
    public Herbivorous(int age , String color , String Hname)
    {
        super(age,color);
        this.Hname=Hname;

    }

    void meal()
    {
        System.out.println("This animal is Vegeterian ");
        System.out.println("Name of this animal is" + Hname);
        System.out.println("color is :" + color);
        System.out.println("Age is :" + age);
    }
}
class Carnivorous extends ParentAnimal
{
    String Cname;
    public Carnivorous(int age , String color , String Cname)
    {
        super(age,color);
        this.Cname=Cname;
    }
    void meal1()
    {
        System.out.println("This is Non vegiterian");
        System.out.println("His name is :" + Cname);
        System.out.println("Color is :" + color);
        System.out.println("His age is :" + age);
    }
}
class Other
{
    public static void main(String[] args) {
        Herbivorous h1 = new Herbivorous(4 , "Gray" , "Elephant");
        h1.display();
        h1.meal();

        Carnivorous c1 = new Carnivorous(2 , "Yellow" , "Tiger");
        c1.display();
        c1.meal1();
    }
}
