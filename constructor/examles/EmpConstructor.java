package com.constructor.examles;

public class EmpConstructor
{
// instance variables
    int id;
    double salary;
    String name;

    public EmpConstructor(int id , String name , double salary) //parameterised constructor
    {
        this();    // this() used for accesss the zero parameterised constructor
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public EmpConstructor()
    {
        System.out.println("This is zero parameterised constructor");
    }
    public void display()
    {
        System.out.println("The value of id is: " + id);
        System.out.println("name is :" + name);
        System.out.println("salary is: " + salary);
    }
    public static void main(String[] args)
    {
        //we are initialising the constructor by passing the values
        //constructor not need to be called explicitly as like methods
        EmpConstructor e1 = new EmpConstructor(1 , "Sudesh" , 60000);
        e1.display(); //<<-------------------calling the display() method using object
    }
}
