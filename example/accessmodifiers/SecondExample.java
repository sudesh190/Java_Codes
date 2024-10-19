package com.example.accessmodifiers;

public class SecondExample
{

    public static void main(String[] args)
    {
        FirstExample first = new FirstExample();
        first.div();
        first.multiply();
        first.add();
        first.getName();
        //first.sub();<------private method accessible only within the same class
    }
}
