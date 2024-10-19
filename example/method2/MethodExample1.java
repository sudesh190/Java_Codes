package com.example.method2;

public class MethodExample1
{
    int i = 10;
    int num1 = 37;
    public void display()          //Instance method , & call it by creating instance or object
                            // it can be call also in another class  using object of previous class
    {
        System.out.println("The value of i :" + i);
        System.out.println("The value f num1:" + num1);
    }
    public static void main(String[] args)
    {
        MethodExample1 obj1 = new MethodExample1();
        obj1.display();
    }
}
