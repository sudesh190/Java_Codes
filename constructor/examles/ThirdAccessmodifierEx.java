package com.constructor.examles;

import com.example.accessmodifiers.FirstExample;

//all qualities of parent class are accessible to child class
//but qualities of child class can not accessed by parent class
public class ThirdAccessmodifierEx extends FirstExample
{

    public static void main(String[] args)
    {
        FirstExample first = new FirstExample(); //object of Parent class

        ThirdAccessmodifierEx t1 = new ThirdAccessmodifierEx(); //object of child class
        t1.getName();
        t1.add();
        //first.sub();<--------private method
        //first.multiply();<<--------protected
        //first.div();<-----default method accessible within the same package only
    }
}
