package com.example.method;

public class Animal
{
    String name;
    double size;

    public void display()
    {
        System.out.println("Name of an Animal is :" + name);
        System.out.println("Size of the Animal is :" + size);
    }
    public static void main(String[] args)
    {
        Animal A1 = new Animal();
        A1.name="Tiger";
        A1.size=7.7;
        A1.display();

        System.out.println("****************************");

        Animal A2 = new Animal();
        A2.name="Elephant";
        A2.size=40.6;
        A2.display();

    }
}
