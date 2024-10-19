package com.SpringCore.Coupling;

// Loose Coupling Example
public interface Peoples
{
    void learn();
}
class Students2 implements Peoples
{
    @Override
    public void learn()
    {
        System.out.println("Students are Learning....");
    }
}
class Employees implements Peoples
{
    @Override
    public void learn()
    {
        System.out.println("Employees are learning......");
    }
}
class Faculty1
{
    Peoples people;
    public static void main(String[] args)
    {
        Faculty1 f1 = new Faculty1();
       // Faculty Teaching To Students2
        f1.people = new Students2();
        f1.people.learn();

        //Faculty Teaching To Employees
        f1.people = new Employees();
        f1.people.learn();

    }
}
